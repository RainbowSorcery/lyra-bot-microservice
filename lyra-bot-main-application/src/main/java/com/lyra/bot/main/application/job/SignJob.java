package com.lyra.bot.main.application.job;



import com.lyra.bot.main.application.entity.User;
import com.lyra.bot.main.application.service.ISignService;
import com.lyra.bot.main.application.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SignJob  {
    @Autowired
    private ISignService signService;
    @Autowired
    private IUserService userService;

    @Scheduled(cron = "0 0 0 * * ? ")
    public void sign() {
        List<User> userList = userService.list();
        signService.setUrl("https://panel2.touhou.tel/");

        userList.forEach((e) -> {
            String cookie = signService.login(e);
            signService.sign(cookie);
        });
    }
}
