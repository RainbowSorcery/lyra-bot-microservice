package com.lyra.bot.main.application.service.impl;

import com.lyra.bot.main.application.entity.AdminUser;
import com.lyra.bot.main.application.mapper.AdminUserRepository;
import com.lyra.bot.main.application.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class AuthServiceImpl implements AuthService {
    @Autowired
    private AdminUserRepository adminUserRepository;


    @Override
    public Boolean auth(Long qq) {
        List<AdminUser> adminUsers = adminUserRepository.findAll(Sort.by("id"));
        List<AdminUser> collect = adminUsers.stream().filter((adminUser -> Objects.equals(adminUser.getQq(), qq))).toList();

        return collect.size() > 0;
    }
}
