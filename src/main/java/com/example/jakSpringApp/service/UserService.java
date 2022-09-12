package com.example.jakSpringApp.service;

import com.example.jakSpringApp.entity.UserEntity;
import com.example.jakSpringApp.exceptions.UserAlreadyExistException;
import com.example.jakSpringApp.exceptions.UserNotFoundException;
import com.example.jakSpringApp.model.User;
import com.example.jakSpringApp.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private transient UserRepo userRepo;

    public UserEntity registration(UserEntity user) throws UserAlreadyExistException {
        if(userRepo.findByUsername(user.getUsername()) != null) {
            throw new UserAlreadyExistException("User with this name already exist!");
        };
        return userRepo.save(user);
    };

    public User getOne(Long id) throws UserNotFoundException {
        UserEntity user = userRepo.findById(id).get();
        if (user == null) {
            throw new UserNotFoundException("User not found.");
        }
        return User.toModel(user);
    }

    public Long deleteUser(Long id) {
        userRepo.deleteById(id);
        return id;
    }
}
