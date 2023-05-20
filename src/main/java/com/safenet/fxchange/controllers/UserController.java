package com.safenet.fxchange.controllers;


import com.safenet.fxchange.entities.User;
import com.safenet.fxchange.exceptions.UserException;
import com.safenet.fxchange.services.UserSerives;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserSerives userSerives;

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userSerives.createUser(user);
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable String id) {
        return userSerives.getUser(id);
    }

    @GetMapping
    public List<User> getUsers() {
        return userSerives.getUsers();
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable String id, @RequestBody User user) {
        return userSerives.updateUserInfo(id, user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable ObjectId id) {
        userSerives.deleteUser(id);
    }

    @ExceptionHandler
    public ResponseEntity<String> handleUserNotFound(UserException e) {
        return ResponseEntity.notFound().build();
    }
}
