package com.lyra.bot.main.application.send;

public interface IQBotSendMessageServiceStrategy {
    void sendMessage(String messageType, Long groupId, Long userId);
}
