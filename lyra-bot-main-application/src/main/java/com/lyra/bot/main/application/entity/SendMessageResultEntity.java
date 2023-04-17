package com.lyra.bot.main.application.entity;

public class SendMessageResultEntity {
    private Integer retcode;
    private String status;
    private Data data;
    private String wording;

    public String getWording() {
        return wording;
    }

    public void setWording(String wording) {
        this.wording = wording;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Integer getRetcode() {
        return retcode;
    }

    public void setRetcode(Integer retcode) {
        this.retcode = retcode;
    }

    @Override
    public String toString() {
        return "SendMessageResultEntity{" +
                "retcode=" + retcode +
                ", status='" + status + '\'' +
                ", data=" + data +
                '}';
    }

    private static class Data  {
        private Long message_id;

        @Override
        public String toString() {
            return "data{" +
                    "message_id=" + message_id +
                    '}';
        }

        public Long getMessage_id() {
            return message_id;
        }

        public void setMessage_id(Long message_id) {
            this.message_id = message_id;
        }
    }
}
