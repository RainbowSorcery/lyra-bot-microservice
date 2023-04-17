package com.lyra.bot.main.application.service.impl;


import com.lyra.bot.main.application.entity.Log;
import com.lyra.bot.main.application.mapper.LogRepository;
import com.lyra.bot.main.application.service.ILogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements ILogService {
    @Autowired
    private LogRepository logRepository;

    @Override
    public void save(Log log) {
        logRepository.save(log);
    }
}
