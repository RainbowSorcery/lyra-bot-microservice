package com.lyra.bot.main.application.service.impl;

import com.lyra.bot.main.application.entity.User;
import com.lyra.bot.main.application.mapper.UserRepository;
import com.lyra.bot.main.application.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> list() {
        return userRepository.findAll();
    }
}
