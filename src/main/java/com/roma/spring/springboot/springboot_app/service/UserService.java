package com.roma.spring.springboot.springboot_app.service;

import com.roma.spring.springboot.springboot_app.model.User;
import java.util.List;

public interface UserService {
    public List<User> getAllUsers();

    public void saveUser(User user);

    public User getUser(int id);

    public void deleteUser(int id);
}
