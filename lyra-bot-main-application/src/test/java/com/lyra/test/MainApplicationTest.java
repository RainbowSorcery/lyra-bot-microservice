package com.lyra.test;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.text.StrBuilder;
import com.lyra.bot.main.application.QqBotApplication;
import com.lyra.bot.main.application.entity.dto.VpnLoginDTO;
import com.lyra.bot.main.application.entity.dto.VpnLoginResult;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
@ContextConfiguration(classes = QqBotApplication.class)
public class MainApplicationTest {
    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void test() {

        VpnLoginDTO vpnLoginDTO = new VpnLoginDTO();
        vpnLoginDTO.setEmail("365373011@qq.com");
        vpnLoginDTO.setPasswd("qq365373011");

        ResponseEntity<VpnLoginResult> vpnLoginResultResponseEntity = restTemplate.postForEntity("https://panel3.touhou.tel/auth/login", vpnLoginDTO, VpnLoginResult.class);

        HttpHeaders headers = vpnLoginResultResponseEntity.getHeaders();

        List<String> setCookieList = headers.get("Set-Cookie");

        if (CollUtil.isEmpty(setCookieList)) {
            return;
        }

        StrBuilder setCookieBuilder = new StrBuilder();
        for (String item : setCookieList) {
            setCookieBuilder.append(item).append(";");
        }

//        restTemplate.postForEntity("https://panel3.touhou.tel/user/checkin", null, )


    }
}
