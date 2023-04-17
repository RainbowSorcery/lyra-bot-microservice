package com.lyra.bot.main.application.entity;

import java.util.List;

public class SexImgEntity {
    private String error;
    private List<SexImgData> data;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public List<SexImgData> getData() {
        return data;
    }

    public void setData(List<SexImgData> data) {
        this.data = data;
    }


    public static class SexImgData {
        private Integer pid;
        private Integer p;
        private Integer uid;
        private String title;
        private String another;
        private Boolean r18;
        private Integer width;
        private Integer height;
        private List<String> tags;
        private String ext;
        private Long uploadDate;
        private Urls urls;

        public Integer getPid() {
            return pid;
        }

        public void setPid(Integer pid) {
            this.pid = pid;
        }

        public Integer getP() {
            return p;
        }

        public void setP(Integer p) {
            this.p = p;
        }

        public Integer getUid() {
            return uid;
        }

        public void setUid(Integer uid) {
            this.uid = uid;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAnother() {
            return another;
        }

        public void setAnother(String another) {
            this.another = another;
        }

        public Boolean getR18() {
            return r18;
        }

        public void setR18(Boolean r18) {
            this.r18 = r18;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public List<String> getTags() {
            return tags;
        }

        public void setTags(List<String> tags) {
            this.tags = tags;
        }

        public String getExt() {
            return ext;
        }

        public void setExt(String ext) {
            this.ext = ext;
        }

        public Long getUploadDate() {
            return uploadDate;
        }

        public void setUploadDate(Long uploadDate) {
            this.uploadDate = uploadDate;
        }

        public Urls getUrls() {
            return urls;
        }

        public void setUrls(Urls urls) {
            this.urls = urls;
        }

        public static class Urls {
            private String original;

            public String getOriginal() {
                return original;
            }

            public void setOriginal(String original) {
                this.original = original;
            }
        }
    }
}
