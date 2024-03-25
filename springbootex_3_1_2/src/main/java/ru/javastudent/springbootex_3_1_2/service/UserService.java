package ru.javastudent.springbootex_3_1_2.service;



import ru.javastudent.springbootex_3_1_2.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUser(long id);

    User deleteUser(long id);

    void createUser(User user);

    void updateUser(User user);
}
