package com.stylefile.stylefile_app.entity; // ✅ Ensure this matches the actual package

import jakarta.persistence.*;

@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int reviewId;

    private String fit;
    private int rating;
    private String reviewText;
    private String reviewSummary;
    private String rentedFor;
    private String reviewDate;

    @ManyToOne
    @JoinColumn(name = "item_item_id", referencedColumnName = "item_id") // ✅ Ensure this matches `Item.java`
    private Item item;

    @ManyToOne
    @JoinColumn(name = "user_user_id", referencedColumnName = "userId")
    private User user;

    // Getters and Setters
}
