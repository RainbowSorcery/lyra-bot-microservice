package com.lyra.common.response;

public enum ResponseEnums {
    SUCCESS(200, "ok", true),
    FILED(500, "filed", false);
    private Integer code;
    private String desc;
    private Boolean success;


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    ResponseEnums(Integer code, String desc, Boolean success) {
        this.code = code;
        this.desc = desc;
        this.success = success;
    }
}
