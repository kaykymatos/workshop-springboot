package com.kaykymatos.workshopmongo.services;

import com.kaykymatos.workshopmongo.domain.User;
import com.kaykymatos.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }
}
