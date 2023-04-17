package com.lyra.bot.main.application.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PonyImageEntity {
    @JsonProperty("derpibooru-url")
    private String derpibooruUrl;
    @JsonProperty("pony-image-url")
    private String ponyImageUrl;
    private String  tag;

    public String getDerpibooruUrl() {
        return derpibooruUrl;
    }

    public void setDerpibooruUrl(String derpibooruUrl) {
        this.derpibooruUrl = derpibooruUrl;
    }

    public String getPonyImageUrl() {
        return ponyImageUrl;
    }

    public void setPonyImageUrl(String ponyImageUrl) {
        this.ponyImageUrl = ponyImageUrl;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
