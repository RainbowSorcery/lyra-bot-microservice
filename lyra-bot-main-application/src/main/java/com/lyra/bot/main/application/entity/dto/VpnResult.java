package com.lyra.bot.main.application.entity.dto;

/**
 * 东方网络登录返回对象
 */
public class VpnResult {

    /**
     * 登录返回值 似乎是返回值为1表示登录成功
     */
    private Integer ret;
    /**
     * 返回信息
     */
    private String msg;


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

    @Override
    public String toString() {
        return "VpnResult{" +
                "ret=" + ret +
                ", msg='" + msg + '\'' +
                '}';
    }
}
