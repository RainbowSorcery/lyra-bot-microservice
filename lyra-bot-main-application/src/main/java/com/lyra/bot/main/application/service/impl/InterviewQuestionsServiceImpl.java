package com.lyra.bot.main.application.service.impl;


import com.lyra.bot.main.application.entity.InterviewQuestionsEntity;
import com.lyra.bot.main.application.entity.SendMessageResultEntity;
import com.lyra.bot.main.application.exception.MyGraceException;
import com.lyra.bot.main.application.mapper.InterviewQuestionsRepository;
import com.lyra.bot.main.application.service.AuthService;
import com.lyra.bot.main.application.service.IInterviewQuestionsService;
import com.lyra.bot.main.application.utils.QQBotUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InterviewQuestionsServiceImpl implements IInterviewQuestionsService {

    @Autowired
    private InterviewQuestionsRepository interviewQuestionsRepository;

    @Autowired
    private QQBotUtils qqBotUtils;

    @Autowired
    private AuthService authService;

    @Override
    public void sendRandomInterviewQuestion(String messageType, Long groupId, Long userId) {
        if (authService.auth(userId)) {

            Long count = interviewQuestionsRepository.getInterviewQuestionCount();
            Long random = Double.valueOf(Math.random() * count).longValue();

            InterviewQuestionsEntity interviewQuestionsEntity = interviewQuestionsRepository.selectOneInterviewQuestion(random);

            String sendMessage = "问题：" + interviewQuestionsEntity.getQuestion() + "\n" +
                    "答案：" + interviewQuestionsEntity.getAnswer() + "\n" +
                    "该题被输出：" + interviewQuestionsEntity.getPrintCount() + "次。";


            String replaceSendMessage = sendMessage.replace(";", "");
            SendMessageResultEntity sendMessageResultEntity = qqBotUtils.sendMessage(messageType, userId, groupId, replaceSendMessage, true);

            if (sendMessageResultEntity.getStatus().equals("failed")) {
                throw new MyGraceException("错误信息：" + sendMessageResultEntity.getWording(), messageType, userId, groupId);
            }

            interviewQuestionsEntity.setPrintCount(interviewQuestionsEntity.getPrintCount() + 1);

            interviewQuestionsRepository.saveAndFlush(interviewQuestionsEntity);
        } else {
            qqBotUtils.sendMessage(messageType, userId, groupId, "该用户不是管理员，没有该指令权限。", true);
        }


    }
}
