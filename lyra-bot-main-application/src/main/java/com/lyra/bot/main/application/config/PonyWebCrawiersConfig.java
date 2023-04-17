package com.lyra.bot.main.application.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "random-pony-image-api")
@Configuration
public class PonyWebCrawiersConfig {
    private String url;
    private String group;
    private String randomLyraImg;
    private String randomBackgroundPonyImage;
    private String randomTSImage;
    private String randomRDImage;
    private String randomRRImage;
    private String randomSnowdropImage;
    private String randomNyxImage;
    private String randomPinkiePieImage;
    private String randomFlutterShyPieImage;
    private String randomAppleJackPieImage;
    private String randomLunaImage;
    private String getRandomPonyImageToTag;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getRandomLyraImg() {
        return randomLyraImg;
    }

    public void setRandomLyraImg(String randomLyraImg) {
        this.randomLyraImg = randomLyraImg;
    }

    public String getRandomBackgroundPonyImage() {
        return randomBackgroundPonyImage;
    }

    public void setRandomBackgroundPonyImage(String randomBackgroundPonyImage) {
        this.randomBackgroundPonyImage = randomBackgroundPonyImage;
    }

    public String getRandomTSImage() {
        return randomTSImage;
    }

    public void setRandomTSImage(String randomTSImage) {
        this.randomTSImage = randomTSImage;
    }

    public String getRandomRDImage() {
        return randomRDImage;
    }

    public void setRandomRDImage(String randomRDImage) {
        this.randomRDImage = randomRDImage;
    }

    public String getRandomRRImage() {
        return randomRRImage;
    }

    public void setRandomRRImage(String randomRRImage) {
        this.randomRRImage = randomRRImage;
    }

    public String getRandomSnowdropImage() {
        return randomSnowdropImage;
    }

    public void setRandomSnowdropImage(String randomSnowdropImage) {
        this.randomSnowdropImage = randomSnowdropImage;
    }

    public String getRandomNyxImage() {
        return randomNyxImage;
    }

    public void setRandomNyxImage(String randomNyxImage) {
        this.randomNyxImage = randomNyxImage;
    }

    public String getRandomPinkiePieImage() {
        return randomPinkiePieImage;
    }

    public void setRandomPinkiePieImage(String randomPinkiePieImage) {
        this.randomPinkiePieImage = randomPinkiePieImage;
    }

    public String getRandomFlutterShyPieImage() {
        return randomFlutterShyPieImage;
    }

    public void setRandomFlutterShyPieImage(String randomFlutterShyPieImage) {
        this.randomFlutterShyPieImage = randomFlutterShyPieImage;
    }

    public String getRandomAppleJackPieImage() {
        return randomAppleJackPieImage;
    }

    public void setRandomAppleJackPieImage(String randomAppleJackPieImage) {
        this.randomAppleJackPieImage = randomAppleJackPieImage;
    }

    public String getRandomLunaImage() {
        return randomLunaImage;
    }

    public void setRandomLunaImage(String randomLunaImage) {
        this.randomLunaImage = randomLunaImage;
    }

    public String getGetRandomPonyImageToTag() {
        return getRandomPonyImageToTag;
    }

    public void setGetRandomPonyImageToTag(String getRandomPonyImageToTag) {
        this.getRandomPonyImageToTag = getRandomPonyImageToTag;
    }
}
