package com.lyra.bot.main.application.send;

import com.lyra.bot.main.application.service.IPonyMusic163Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SendRandomMusicStrategy implements IQBotSendMessageServiceStrategy {
    @Autowired
    private IPonyMusic163Service ponyMusic163Service;

    @Override
    public void sendMessage(String messageType, Long groupId, Long userId) {
        ponyMusic163Service.sendRandomMusic(messageType, groupId, userId);
    }
}
