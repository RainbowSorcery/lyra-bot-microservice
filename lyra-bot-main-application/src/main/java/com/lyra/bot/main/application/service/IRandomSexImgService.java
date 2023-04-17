package com.lyra.bot.main.application.service;


import com.lyra.bot.main.application.send.IQBotSendMessageServiceStrategy;

public interface IRandomSexImgService extends IQBotSendMessageServiceStrategy {
    void getRandomSexImg(String messageType, Long groupId, Long userId);
}
