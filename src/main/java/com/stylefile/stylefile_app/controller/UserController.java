package com.stylefile.stylefile_app.controller;

import com.stylefile.stylefile_app.entity.User;
import com.stylefile.stylefile_app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*") // Allow frontend access
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{userId}") // ✅ Ensure correct variable name
    public ResponseEntity<User> getUserById(@PathVariable String userId) {
        Optional<User> user = userRepository.findById(userId);
        return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return ResponseEntity.ok(userRepository.save(user));
    }

    @PutMapping("/{userId}")
    public ResponseEntity<User> updateUser(@PathVariable String userId, @RequestBody User updatedUser) {
        return userRepository.findById(userId).map(user -> {
            user.setUserName(updatedUser.getUserName());
            user.setAge(updatedUser.getAge());
            user.setHeight(updatedUser.getHeight());
            user.setWeight(updatedUser.getWeight());
            user.setBodyType(updatedUser.getBodyType());
            user.setBraSize(updatedUser.getBraSize());
            return ResponseEntity.ok(userRepository.save(user));
        }).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<String> deleteUser(@PathVariable String userId) {
        if (userRepository.existsById(userId)) {
            userRepository.deleteById(userId);
            return ResponseEntity.ok("User deleted successfully.");
        }
        return ResponseEntity.notFound().build();
    }
}

