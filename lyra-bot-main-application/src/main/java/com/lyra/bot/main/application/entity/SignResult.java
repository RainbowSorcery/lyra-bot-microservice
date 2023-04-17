package com.lyra.bot.main.application.entity;

public class SignResult {
    private Integer ret;
    private String msg;

    @Override
    public String toString() {
        return "SignResult{" +
                "ret=" + ret +
                ", msg='" + msg + '\'' +
                '}';
    }

    public Integer getRet() {
        return ret;
    }

    public void setRet(Integer ret) {
        this.ret = ret;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
