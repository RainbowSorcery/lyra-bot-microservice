package com.lyra.common.enums;

public enum VPNTypeEnums {
    touhou("TOUHOU", "东方网络");
    private String code;
    private String desc;

    VPNTypeEnums(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
