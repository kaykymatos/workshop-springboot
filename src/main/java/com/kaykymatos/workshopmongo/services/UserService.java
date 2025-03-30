package com.kaykymatos.workshopmongo.services;

import com.kaykymatos.workshopmongo.domain.User;
import com.kaykymatos.workshopmongo.dto.UserDTO;
import com.kaykymatos.workshopmongo.repository.UserRepository;
import com.kaykymatos.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(String id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public User insert(User obj) {
        return repository.insert(obj);
    }

    public User fromDto(UserDTO dto) {
        return new User(dto.getId(), dto.getName(), dto.getEmail());
    }
}
