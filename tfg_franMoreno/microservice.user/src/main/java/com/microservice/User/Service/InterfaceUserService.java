package com.microservice.User.Service;

import com.microservice.User.entities.User;

import java.util.List;

public interface InterfaceUserService {
    List<User> findAll();
    User findById(Long id);
    void save(User user);
    List<User> findByIdTimeLine(Long idTimeLine);
}
