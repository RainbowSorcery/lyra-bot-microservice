package com.lyra.bot.main.application.controller;

import com.lyra.bot.main.application.entity.ListenerEntity;
import com.lyra.bot.main.application.send.IQBotSendMessageServiceStrategy;
import com.lyra.bot.main.application.send.SendMessageStrategyContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class BotController {
    @Autowired
    private SendMessageStrategyContext sendMessageStrategyContext;



    @PostMapping("/")
    public void listener(@RequestBody ListenerEntity listenerBody) {
        IQBotSendMessageServiceStrategy service = sendMessageStrategyContext.getService(listenerBody.getMessage());
        if (service != null) {
            service.sendMessage(listenerBody.getMessage_type(), listenerBody.getGroup_id(), listenerBody.getUser_id());
        }
    }

}
