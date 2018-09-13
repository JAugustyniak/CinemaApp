package pl.coderslab.service;

import pl.coderslab.entity.User;

import java.util.List;

public interface UserService {
    User findOne(int id);

    User save(User user);

    List<User> findAll();
}
