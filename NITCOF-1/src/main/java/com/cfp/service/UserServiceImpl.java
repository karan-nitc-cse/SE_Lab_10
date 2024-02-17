package com.cfp.service;

import com.cfp.entity.User;
import com.cfp.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo repo;
    @Override
    public void registerUser(User user) {
        repo.save(user);
    }


    @Override
    public User save(User user) {
        return repo.save(user);
    }

    @Override
    public User getUserByUsername(String username) {
        return repo.findByUsername(username);
    }
}
