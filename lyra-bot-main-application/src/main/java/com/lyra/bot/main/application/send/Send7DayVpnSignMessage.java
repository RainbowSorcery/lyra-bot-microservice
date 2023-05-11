package com.lyra.bot.main.application.send;

import com.lyra.bot.main.application.service.IVpnSignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Send7DayVpnSignMessage implements IQBotSendMessageServiceStrategy {
    @Autowired
    private IVpnSignService signService;

    @Override
    public void sendMessage(String messageType, Long groupId, Long userId) {
//        signService.get7TotalSignLog(messageType, groupId, userId);
    }
}
