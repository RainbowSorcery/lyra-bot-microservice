package com.lyra.bot.main.application.service;


public interface IInterviewQuestionsService {
    void sendRandomInterviewQuestion(String messageType, Long groupId, Long userId);
}
