package com.stylefile.stylefile_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.stylefile.stylefile_app.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {  // ✅ Matches String userId
}

