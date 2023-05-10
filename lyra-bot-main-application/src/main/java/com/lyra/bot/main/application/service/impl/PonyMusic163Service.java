package com.lyra.bot.main.application.service.impl;

import com.lyra.bot.main.application.entity.PonyMusic163;
import com.lyra.bot.main.application.utils.QQBotUtils;
import com.lyra.bot.main.application.mapper.PonyMusic163Repository;
import com.lyra.bot.main.application.service.IPonyMusic163Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PonyMusic163Service implements IPonyMusic163Service {
    @Autowired
    private PonyMusic163Repository ponyMusic163Repository;

    @Autowired
    private QQBotUtils qqBotUtils;

    @Override
    public void sendRandomMusic(String messageType, Long groupId, Long userId) {
        List<PonyMusic163> ponyMusic163s = ponyMusic163Repository.findAll();

        int i = (int) (Math.random() * ponyMusic163s.size());

        qqBotUtils.send163MusicMessage(messageType, userId, groupId, ponyMusic163s.get(i).getId());
    }
}
