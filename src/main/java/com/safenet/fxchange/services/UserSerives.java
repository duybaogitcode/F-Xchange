package com.safenet.fxchange.services;

import com.safenet.fxchange.entities.User;
import com.safenet.fxchange.exceptions.UserException;
import com.safenet.fxchange.repositories.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@Service
public class UserSerives {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User getUser(ObjectId id) {
        return userRepository.findById(id).orElseThrow(() -> new UserException("User not found!"));
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public void updateUserInfo(User user) {
        User existingUser = getUser(user.getId());
        existingUser.setInformations(user.getInformations());
    }

    public void deleteUser(ObjectId id) {
        userRepository.findById(id).orElseThrow(() -> new UserException("User not found!"));
        userRepository.deleteById(id);
    }
}
