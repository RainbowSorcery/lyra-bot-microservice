package com.lyra.scheduler.service;

import com.lyra.scheduler.entity.VPNUserInfo;
import com.lyra.scheduler.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VPNUserInfoServiceImpl implements IVPNUserInfoService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<VPNUserInfo> list(Example<VPNUserInfo> example) {
        return userRepository.findAll();
    }

    @Override
    public List<VPNUserInfo> listUserInfoByType(String code) {
        return userRepository.findByType(code);
    }
}
