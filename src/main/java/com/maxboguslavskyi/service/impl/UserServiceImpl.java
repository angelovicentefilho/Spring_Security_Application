package com.maxboguslavskyi.service.impl;

import com.maxboguslavskyi.entity.User;
import com.maxboguslavskyi.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getUser(String login) {
        User user = new User();
        user.setLogin(login);
        user.setPassword("b1b3773a05c0ed0176787a4f1574ff0075f7521e");

        return user;
    }

}
