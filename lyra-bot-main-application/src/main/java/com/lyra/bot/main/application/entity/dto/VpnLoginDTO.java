package com.lyra.bot.main.application.entity.dto;

public class VpnLoginDTO {
    /**
     * 密码
     */
    private String passwd;
    /**
     * 记住我的时间
     */
    private String remember_me = "week";
    /**
     * 电子邮件
     */
    private String email;


    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getRemember_me() {
        return remember_me;
    }

    public void setRemember_me(String remember_me) {
        this.remember_me = remember_me;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
