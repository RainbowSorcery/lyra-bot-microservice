package com.lyra.bot.main.application.send;

import org.springframework.stereotype.Component;

@Component
public class Send7DayVpnSignMessage implements IQBotSendMessageServiceStrategy {

    @Override
    public void sendMessage(String messageType, Long groupId, Long userId) {
//        signService.get7TotalSignLog(messageType, groupId, userId);
    }
}
