package com.lyra.common.enums;

public enum MessageType {
    GROUP_MESSAGE("group"),
    PRIVATE_MESSAGE("private");

    private String type;

    MessageType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
