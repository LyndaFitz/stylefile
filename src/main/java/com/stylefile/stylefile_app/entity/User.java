package com.stylefile.stylefile_app.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "users")
@Getter  // ✅ Generates all getter methods
@Setter  // ✅ Generates all setter methods
@NoArgsConstructor  // ✅ Generates a default no-args constructor
@AllArgsConstructor  // ✅ Generates a constructor with all fields
public class User {
    
    @Id
    @Column(name = "user_id", nullable = false, unique = true)
    private String userId;

    @Column(name = "user_name")
    private String userName;

    private Integer age;
    private String height;
    private String weight;
    private String bodyType;
    private String braSize;
}

