package com.lyra.bot.main.application.utils;

import com.lyra.bot.main.application.config.CqHttpResouce;
import com.lyra.bot.main.application.entity.SendMessageResultEntity;
import com.lyra.common.enums.HttpAPI;
import com.lyra.common.enums.MessageType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class QQBotUtils {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private CqHttpResouce cqHttpResouce;

    public SendMessageResultEntity sendMessage(String messageType, Long userId, Long groupId, String message, Boolean autoEscape) {
        String sendMessageUrl = "";
        if (messageType.equals(MessageType.GROUP_MESSAGE.getType())) {
            sendMessageUrl = cqHttpResouce.getServer() + HttpAPI.SEND_MESSAGE +
                    "?message_type=" + messageType + "&group_id=" + groupId + "&message=" + message + "&auto_escape=" + autoEscape;
        } else if (messageType.equals(MessageType.PRIVATE_MESSAGE.getType())) {
            sendMessageUrl = cqHttpResouce.getServer() + HttpAPI.SEND_MESSAGE +
                    "?message_type=" + messageType + "&user_id=" + userId + "&message=" + message + "&auto_escape=" + autoEscape;
        }

        return restTemplate.getForObject(sendMessageUrl, SendMessageResultEntity.class);
    }

    public SendMessageResultEntity sendImgMessage(String messageType, Long userId, Long groupId, String message, String imgUrl) {
        String sendMessageUrl = "";
        if (messageType.equals(MessageType.GROUP_MESSAGE.getType())) {
            sendMessageUrl = cqHttpResouce.getServer() + HttpAPI.SEND_MESSAGE +
                    "?message_type=" + messageType + "&group_id=" + groupId + "&message=" + "[CQ:image,file=" + imgUrl +"]" + message + "&auto_escape=" + false;
        } else if (messageType.equals(MessageType.PRIVATE_MESSAGE.getType())) {
            sendMessageUrl = cqHttpResouce.getServer() + HttpAPI.SEND_MESSAGE +
                    "?message_type=" + messageType + "&user_id=" + userId + "&message=" + "[CQ:image,file=" + imgUrl +"]" + message + "&auto_escape=" + false;
        }

        return restTemplate.getForObject(sendMessageUrl, SendMessageResultEntity.class);
    }

    public SendMessageResultEntity send163MusicMessage(String messageType, Long userId, Long groupId, Integer musicId) {
        return this.sendMessage(messageType, userId, groupId, "[CQ:music,type=163,id=" + musicId +"]", false);
    }
}
