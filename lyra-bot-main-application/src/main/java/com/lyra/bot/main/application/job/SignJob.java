package com.lyra.bot.main.application.job;


import com.lyra.bot.main.application.service.IVPNUserInfoService;
import com.lyra.bot.main.application.service.IVpnSignService;
import com.lyra.common.enums.VPNTypeEnums;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SignJob {
    @Autowired
    private IVpnSignService signService;

    @Autowired
    private IVPNUserInfoService vpnUserInfoService;


    @Scheduled(cron = "0 0 3 * * ?")
    public void sign() {
        vpnUserInfoService.listUserInfoByType(VPNTypeEnums.touhou.getCode())
                .forEach(vpnUserInfo -> {
                    String cookie = signService.login(vpnUserInfo.getUsername(), vpnUserInfo.getPassword());
                    signService.sign(cookie);
                });
    }
}
