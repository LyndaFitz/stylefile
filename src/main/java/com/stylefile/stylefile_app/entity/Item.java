package com.stylefile.stylefile_app.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "item")
public class Item {

    @Id
    @Column(name = "item_id", nullable = false, unique = true)
    private String itemId;

    private String category;
    private String size;
    private Integer waist;
    private Integer hips;
    private String bra_size;
    private Integer length;
    private String description;
    private String quality;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;

    // Getters and Setters
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Integer getWaist() {
        return waist;
    }

    public void setWaist(Integer waist) {
        this.waist = waist;
    }

    public Integer getHips() {
        return hips;
    }

    public void setHips(Integer hips) {
        this.hips = hips;
    }

//    public Integer getBust() {
//        return bust;
//        
//        
//    }
//
//    public void setBust(Integer bust) {
//        this.bust = bust;
//    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

