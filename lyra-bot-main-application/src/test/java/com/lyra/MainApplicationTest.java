package com.lyra;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.text.StrBuilder;
import com.lyra.bot.main.application.QqBotApplication;
import com.lyra.bot.main.application.entity.dto.VpnLoginDTO;
import com.lyra.bot.main.application.entity.dto.VpnResult;
import com.lyra.bot.main.application.job.SignJob;
import com.lyra.bot.main.application.service.IVpnSignService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootTest
@ContextConfiguration(classes = QqBotApplication.class)
public class MainApplicationTest {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private IVpnSignService iVpnSignService;

    @Autowired
    private SignJob signJob;

    @Test
    public void vpnSingTest() {
        signJob.sign();
    }

    @Test
    public void test() {

        VpnLoginDTO vpnLoginDTO = new VpnLoginDTO();
        vpnLoginDTO.setEmail("365373011@qq.com");
        vpnLoginDTO.setPasswd("qq365373011");

        ResponseEntity<VpnResult> vpnLoginResultResponseEntity = restTemplate.postForEntity("https://panel3.touhou.tel/auth/login", vpnLoginDTO, VpnResult.class);

        HttpHeaders headers = vpnLoginResultResponseEntity.getHeaders();

        List<String> setCookieList = headers.get("Set-Cookie");

        if (CollUtil.isEmpty(setCookieList)) {
            return;
        }

        StrBuilder setCookieBuilder = new StrBuilder();
        for (String item : setCookieList) {
            setCookieBuilder.append(item).append(";");
        }


        MultiValueMap<String, String> httpHeaders = new HttpHeaders();
        httpHeaders.add("Cookie", setCookieBuilder.toString());
        HttpEntity<String> stringHttpEntity = new HttpEntity<>("", httpHeaders);

        ResponseEntity<VpnResult> stringResponseEntity = restTemplate.postForEntity("https://panel3.touhou.tel/user/checkin", stringHttpEntity, VpnResult.class);

        System.out.println(stringResponseEntity.getBody());


    }
}
