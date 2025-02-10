package com.stylefile.stylefile_app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity  // This tells Spring Boot that this class maps to a database table
@Table(name = "users")  // Ensures that the table name in MySQL is "users"
public class User {

    @Id  // Marks this field as the primary key
    private String userId;  // Matches the user_id column in SQL

    private String userName;  // Matches the user_name column in SQL
    private int age;
    private String height;
    private String weight;
    private String bodyType;
    private String bustSize;
    private String cupSize;
    private String braSize;

    // Getters and Setters (required for accessing these fields)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getBustSize() {
        return bustSize;
    }

    public void setBustSize(String bustSize) {
        this.bustSize = bustSize;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public String getBraSize() {
        return braSize;
    }

    public void setBraSize(String braSize) {
        this.braSize = braSize;
    }
}

