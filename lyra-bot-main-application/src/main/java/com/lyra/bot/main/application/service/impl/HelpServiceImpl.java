package com.lyra.bot.main.application.service.impl;

import com.lyra.bot.main.application.service.IHelpService;
import com.lyra.bot.main.application.utils.QQBotUtils;
import com.lyra.common.enums.QQBotServiceEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelpServiceImpl implements IHelpService {
    @Autowired
    private QQBotUtils qqBotUtils;

    @Override
    public void sendHelpList(String messageType, Long groupId, Long userId) {

        StringBuilder stringBuilder = new StringBuilder();

        int i = 0;
        for (QQBotServiceEnum value : QQBotServiceEnum.values()) {
            i++;
            stringBuilder.append(i).append(".").append(value.getMessage()).append("。\n");
        }

        qqBotUtils.sendMessage(messageType, userId, groupId, stringBuilder.toString(), true);
    }
}
