package com.lyra.scheduler.service;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.text.StrBuilder;
import com.lyra.common.enums.VPNTypeEnums;
import com.lyra.scheduler.entity.dto.VpnLoginDTO;
import com.lyra.scheduler.entity.dto.VpnResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * 东方网络签到service
 */
@Service
public class TouhouVpnSignServiceImpl implements IVpnSignService {
    private static final Logger log = LoggerFactory.getLogger(TouhouVpnSignServiceImpl.class);

    private static final String loginUrl = "https://panel3.touhou.tel/auth/login";
    private static final String signUrl = "https://panel3.touhou.tel/user/checkin";


    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String login(String username, String password) {
        // 设置登录请求体
        VpnLoginDTO vpnLoginDTO = new VpnLoginDTO();
        vpnLoginDTO.setEmail(username);
        vpnLoginDTO.setPasswd(password);

        // 登录
        ResponseEntity<VpnResult> vpnLoginResultResponseEntity = restTemplate.postForEntity(loginUrl, vpnLoginDTO, VpnResult.class);

        // 获取cookie
        HttpHeaders headers = vpnLoginResultResponseEntity.getHeaders();

        List<String> setCookieList = headers.get("Set-Cookie");

        if (CollUtil.isEmpty(setCookieList)) {
            return null;
        }

        // 拼接cookie
        StrBuilder setCookieBuilder = new StrBuilder();
        for (String item : setCookieList) {
            setCookieBuilder.append(item).append(";");
        }

        return setCookieBuilder.toString();
    }

    @Override
    public void sign(String cookie) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Cookie", cookie);
        HttpEntity<String> stringHttpEntity = new HttpEntity<>("", httpHeaders);
        ResponseEntity<VpnResult> stringResponseEntity = restTemplate.postForEntity(signUrl, stringHttpEntity, VpnResult.class);
        VpnResult responseBody = stringResponseEntity.getBody();

        if (responseBody != null) {
            log.info("VPN类型:{}, 签到结果:{},信息:{}", VPNTypeEnums.touhou.getDesc(), responseBody.getRet(), responseBody.getMsg());
        }
    }
}
