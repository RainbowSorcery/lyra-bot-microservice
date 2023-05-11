package com.lyra.common.enums;

public enum QQBotServiceEnum {
    GET_HELP_MESSAGE("/help"),
//    GET_7_DAY_SIGN_MESSAGE("获取七天内vpn签到信息"),
//    GET_PONY_FEATURED_IMG("获取特殊小马图片"),
    GET_BACKGROUND_PONY_IMAGE("随机背景小马天琴图"),
    GET_LYRA_HEARTSTRINGS_IMAGE("随机天琴图"),
    GET_TS_IMAGE("随机ts图"),
    GET_RD_IMAGE("随机rd图"),
    GET_RR_IMAGE("随机rr图"),
    GET_SNOWDROP_IMAGE("随机落雪图"),
    GET_NYX_IMAGE("随机nyx图"),
    GET_PINKIE_PIE_IMAGE("随机pp图"),
    GET_FLUTTERSHY_IMAGE("随机fs图"),
    GET_APPLEJACK_IMAGE("随机aj图"),
    GET_LUNA_IMAGE("随机luna图"),
//    GET_RANDOM_PONY_MUSIC("随机小马音乐"),
//    GET_TRENDING_PONY_IMAGE("热门小马图片"),
//    GET_RANDOM_SEX_IMAGE("随机色图")
    ;
    private String message;

    QQBotServiceEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
