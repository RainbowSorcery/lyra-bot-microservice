package com.lyra.scheduler.service;


import com.lyra.scheduler.entity.VPNUserInfo;
import org.springframework.data.domain.Example;

import java.util.List;

public interface IVPNUserInfoService {
    List<VPNUserInfo> list(Example<VPNUserInfo> example);

    List<VPNUserInfo> listUserInfoByType(String code);
}
