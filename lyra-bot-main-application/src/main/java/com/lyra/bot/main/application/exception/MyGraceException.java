package com.lyra.bot.main.application.exception;

public class MyGraceException extends RuntimeException {
    private String message;
    private String messageType;
    private Long userId;
    private Long groupId;


    public MyGraceException(String message, String messageType, Long userId, Long groupId) {
        this.message = message;
        this.messageType = messageType;
        this.userId = userId;
        this.groupId = groupId;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }
}
