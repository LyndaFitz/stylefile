package com.stylefile.stylefile_app.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "item") // ✅ Ensure this matches the actual DB table name
public class Item {

    @Id
    @Column(name = "item_id", length = 255, nullable = false) // ✅ Matches SQL schema
    private String itemId;

    @Column(name = "name", length = 255)
    private String name;

    @Column(name = "description", length = 255)
    private String description;

    @Column(name = "category", length = 255)
    private String category;

    @Column(name = "size", length = 10) // ✅ Ensure correct column type
    private String size;

    @Column(name = "quality", columnDefinition = "VARCHAR(50)", nullable = false) // ✅ FIXED! Changed from int to String
    private String quality;

    @Column(name = "waist", length = 255)
    private String waist;

    @Column(name = "hips", length = 255)
    private String hips;

    @Column(name = "bust", length = 255)
    private String bust;

    @Column(name = "length", length = 255)
    private String length;

    // ✅ Getters and Setters
    public String getItemId() { return itemId; }
    public void setItemId(String itemId) { this.itemId = itemId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getSize() { return size; }
    public void setSize(String size) { this.size = size; }

    public String getQuality() { return quality; } // ✅ Changed return type to String
    public void setQuality(String quality) { this.quality = quality; } // ✅ Changed parameter type to String

    public String getWaist() { return waist; }
    public void setWaist(String waist) { this.waist = waist; }

    public String getHips() { return hips; }
    public void setHips(String hips) { this.hips = hips; }

    public String getBust() { return bust; }
    public void setBust(String bust) { this.bust = bust; }

    public String getLength() { return length; }
    public void setLength(String length) { this.length = length; }
}
