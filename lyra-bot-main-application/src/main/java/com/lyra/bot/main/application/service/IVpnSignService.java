package com.lyra.bot.main.application.service;

public interface IVpnSignService {
    /**
     * 登录
     * @param username 用户名
     * @param password 密码
     * @return cookie
     */
    String login(String username, String password);

    /**
     * 签到
     * @param cookie cookie
     */
    void sign(String cookie);
}
