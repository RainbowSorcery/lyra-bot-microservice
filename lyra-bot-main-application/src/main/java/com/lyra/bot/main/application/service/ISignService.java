package com.lyra.bot.main.application.service;


import com.lyra.bot.main.application.entity.User;

public interface ISignService {
    void setUrl(String url);

    String login(User user);

    void sign(String cookie);

    void get7TotalSignLog(String messageType, Long groupId, Long userId);
}
