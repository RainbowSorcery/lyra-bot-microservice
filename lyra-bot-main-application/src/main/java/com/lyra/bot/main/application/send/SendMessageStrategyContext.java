package com.lyra.bot.main.application.send;

import cn.hutool.core.util.StrUtil;
import com.lyra.bot.main.application.config.PonyWebCrawiersConfig;
import com.lyra.bot.main.application.service.IRandomSexImgService;
import com.lyra.common.enums.QQBotServiceEnum;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class SendMessageStrategyContext {
    private final Map<String, IQBotSendMessageServiceStrategy> sendMessageServiceStrategyMap =
            new HashMap<>();

    @Autowired
    private SendHelpStrategy sendHelpStrategy;

    @Autowired
    private Send7DayVpnSignMessage send7DayVpnSignMessage;

    @Autowired
    private SendRandomPonyImageMessage sendRandomBackgroundPonyImageMessage;

    @Autowired
    private SendRandomPonyImageMessage sendRandomLyraHeartstringsImageMessage;

    @Autowired
    private SendRandomPonyImageMessage sendRandomTSImageMessage;

    @Autowired
    private SendRandomPonyImageMessage sendRandomRDImageMessage;

    @Autowired
    private SendRandomPonyImageMessage sendRandomRRImageMessage;

    @Autowired
    private SendRandomPonyImageMessage sendRandomSnowdropImageMessage;

    @Autowired
    private SendRandomPonyImageMessage sendRandomNyxImageMessage;

    @Autowired
    private SendRandomPonyImageMessage sendRandomPinkiePieImageMessage;

    @Autowired
    private SendRandomPonyImageMessage sendRandomFluttershyImageMessage;

    @Autowired
    private SendRandomPonyImageMessage sendRandomApplejackImageMessage;

    @Autowired
    private SendRandomPonyImageMessage sendRandomLunaImageMessage;

    @Autowired
    private SendRandomMusicStrategy sendRandomMusicStrategy;


    @Autowired
    private IRandomSexImgService randomSexImgService;

    @Autowired
    private PonyWebCrawiersConfig ponyWebCrawiersConfig;


    @PostConstruct
    public void initStrategyMap() {
        sendMessageServiceStrategyMap.put(QQBotServiceEnum.GET_HELP_MESSAGE.getMessage(), sendHelpStrategy);
//        sendMessageServiceStrategyMap.put(QQBotServiceEnum.GET_7_DAY_SIGN_MESSAGE.getMessage(), send7DayVpnSignMessage);

// todo
//        sendMessageServiceStrategyMap.put(QQBotServiceEnum.GET_TRENDING_PONY_IMAGE.getMessage(), sendTrendingPonyImageStrategy);
//        sendMessageServiceStrategyMap.put(QQBotServiceEnum.GET_PONY_FEATURED_IMG.getMessage(), ponyFeaturedImgStrategy);

        sendRandomBackgroundPonyImageMessage.setImageType(ponyWebCrawiersConfig.getRandomBackgroundPonyImage());
        sendMessageServiceStrategyMap.put(QQBotServiceEnum.GET_BACKGROUND_PONY_IMAGE.getMessage(), sendRandomBackgroundPonyImageMessage);
        sendRandomLyraHeartstringsImageMessage.setImageType(ponyWebCrawiersConfig.getRandomLyraImg());
        sendMessageServiceStrategyMap.put(QQBotServiceEnum.GET_LYRA_HEARTSTRINGS_IMAGE.getMessage(), sendRandomLyraHeartstringsImageMessage);
        sendRandomTSImageMessage.setImageType(ponyWebCrawiersConfig.getRandomTSImage());
        sendMessageServiceStrategyMap.put(QQBotServiceEnum.GET_TS_IMAGE.getMessage(), sendRandomTSImageMessage);
        sendRandomRDImageMessage.setImageType(ponyWebCrawiersConfig.getRandomRDImage());
        sendMessageServiceStrategyMap.put(QQBotServiceEnum.GET_RD_IMAGE.getMessage(), sendRandomRDImageMessage);
        sendRandomRRImageMessage.setImageType(ponyWebCrawiersConfig.getRandomRRImage());
        sendMessageServiceStrategyMap.put(QQBotServiceEnum.GET_RR_IMAGE.getMessage(), sendRandomRRImageMessage);
        sendRandomSnowdropImageMessage.setImageType(ponyWebCrawiersConfig.getRandomSnowdropImage());
        sendMessageServiceStrategyMap.put(QQBotServiceEnum.GET_SNOWDROP_IMAGE.getMessage(), sendRandomSnowdropImageMessage);

        sendRandomNyxImageMessage.setImageType(ponyWebCrawiersConfig.getRandomNyxImage());
        sendMessageServiceStrategyMap.put(QQBotServiceEnum.GET_NYX_IMAGE.getMessage(), sendRandomNyxImageMessage);
        sendRandomPinkiePieImageMessage.setImageType(ponyWebCrawiersConfig.getRandomPinkiePieImage());
        sendMessageServiceStrategyMap.put(QQBotServiceEnum.GET_PINKIE_PIE_IMAGE.getMessage(), sendRandomPinkiePieImageMessage);


        sendRandomFluttershyImageMessage.setImageType(ponyWebCrawiersConfig.getRandomFlutterShyPieImage());
        sendMessageServiceStrategyMap.put(QQBotServiceEnum.GET_FLUTTERSHY_IMAGE.getMessage(), sendRandomFluttershyImageMessage);


        sendRandomApplejackImageMessage.setImageType(ponyWebCrawiersConfig.getRandomAppleJackPieImage());
        sendMessageServiceStrategyMap.put(QQBotServiceEnum.GET_APPLEJACK_IMAGE.getMessage(), sendRandomApplejackImageMessage);

        sendRandomLunaImageMessage.setImageType(ponyWebCrawiersConfig.getRandomLunaImage());
        sendMessageServiceStrategyMap.put(QQBotServiceEnum.GET_LUNA_IMAGE.getMessage(), sendRandomLunaImageMessage);

//        sendMessageServiceStrategyMap.put(QQBotServiceEnum.GET_RANDOM_PONY_MUSIC.getMessage(), sendRandomMusicStrategy);


//        sendMessageServiceStrategyMap.put(QQBotServiceEnum.GET_RANDOM_SEX_IMAGE.getMessage(), randomSexImgService);
    }


    public IQBotSendMessageServiceStrategy getService(String type) {
        if (StrUtil.isNotEmpty(type)) {
            return sendMessageServiceStrategyMap.get(type);
        }

        return null;
    }
}
