package com.stylefile.stylefile_app.repository;

import com.stylefile.stylefile_app.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
}

