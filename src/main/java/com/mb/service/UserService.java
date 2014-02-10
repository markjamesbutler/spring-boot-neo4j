package com.mb.service;

import com.mb.domain.User;
import com.mb.dao.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

@Service
@Transactional
public class UserService {

    private UserRepository userRepository;

    @Inject
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(String name) {
        return userRepository.save(new User(name));
    }

    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

}
