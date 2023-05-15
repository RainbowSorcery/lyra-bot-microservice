package com.lyra.scheduler.controller;

import com.lyra.common.response.Result;
import com.lyra.scheduler.job.SignJob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignController {
    @Autowired
    private SignJob signJob;

    @GetMapping("/sign")
    public Result<String> sign() {
        signJob.sign();

        return Result.success();
    }
}
