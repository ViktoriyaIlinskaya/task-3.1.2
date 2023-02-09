package ru.itmentor.spring.boot_security.demo.service;

import ru.itmentor.spring.boot_security.demo.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    List<User> findAll();

    User find(Long userId) throws IllegalArgumentException;

    void delete(Long userId);

    void save(User user);

    void update(User user);
}
