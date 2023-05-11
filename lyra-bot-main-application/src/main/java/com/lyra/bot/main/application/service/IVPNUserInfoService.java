package com.lyra.bot.main.application.service;

import com.lyra.bot.main.application.entity.VPNUserInfo;
import org.springframework.data.domain.Example;

import java.util.List;

public interface IVPNUserInfoService {
    List<VPNUserInfo> list(Example<VPNUserInfo> example);

    List<VPNUserInfo> listUserInfoByType(String code);
}
