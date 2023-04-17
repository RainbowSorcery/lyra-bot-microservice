package com.lyra.bot.main.application.exception;

import com.lyra.bot.main.application.utils.QQBotUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyGraceExceptionHandle {
    @Autowired
    private QQBotUtils qqBotUtils;

    private static final Logger log = LoggerFactory.getLogger(MyGraceExceptionHandle.class);

    @ExceptionHandler(value = MyGraceException.class)
    public void myExceptionHandle(MyGraceException myGraceException) {

        qqBotUtils.sendMessage(myGraceException.getMessageType(), myGraceException.getUserId(), myGraceException.getGroupId(), myGraceException.getMessage(), true);

        log.warn("出现异常：{}", myGraceException.getMessage());
    }
}
