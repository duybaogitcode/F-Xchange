package com.safenet.fxchange.controllers;


import com.safenet.fxchange.entities.User;
import com.safenet.fxchange.services.UserSerives;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserSerives userSerives;

    @GetMapping
    public List<User> getUser(){

    return userSerives.getUsers();
    }
}
