package com.lyra.bot.main.application.entity;

public class ListenerEntity {
    private String anonymous;
    private Integer font;
    private Long group_id;
    private String message;
    private Long message_id;
    private Integer message_seq;
    private String message_type;
    private String post_type;
    private String raw_message;
    private Sender sender;
    private String sub_type;
    private Long time;
    private Long user_id;

    @Override
    public String toString() {
        return "ListenerEntity{" +
                "anonymous='" + anonymous + '\'' +
                ", font=" + font +
                ", group_id=" + group_id +
                ", message='" + message + '\'' +
                ", message_id=" + message_id +
                ", message_seq=" + message_seq +
                ", message_type='" + message_type + '\'' +
                ", post_type='" + post_type + '\'' +
                ", raw_message='" + raw_message + '\'' +
                ", sender=" + sender +
                ", sub_type='" + sub_type + '\'' +
                ", time=" + time +
                ", user_id=" + user_id +
                '}';
    }

    public String getAnonymous() {
        return anonymous;
    }

    public void setAnonymous(String anonymous) {
        this.anonymous = anonymous;
    }

    public Integer getFont() {
        return font;
    }

    public void setFont(Integer font) {
        this.font = font;
    }

    public Long getGroup_id() {
        return group_id;
    }

    public void setGroup_id(Long group_id) {
        this.group_id = group_id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getMessage_id() {
        return message_id;
    }

    public void setMessage_id(Long message_id) {
        this.message_id = message_id;
    }

    public Integer getMessage_seq() {
        return message_seq;
    }

    public void setMessage_seq(Integer message_seq) {
        this.message_seq = message_seq;
    }

    public String getMessage_type() {
        return message_type;
    }

    public void setMessage_type(String message_type) {
        this.message_type = message_type;
    }

    public String getPost_type() {
        return post_type;
    }

    public void setPost_type(String post_type) {
        this.post_type = post_type;
    }

    public String getRaw_message() {
        return raw_message;
    }

    public void setRaw_message(String raw_message) {
        this.raw_message = raw_message;
    }

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public String getSub_type() {
        return sub_type;
    }

    public void setSub_type(String sub_type) {
        this.sub_type = sub_type;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    private static class Sender {
        private Integer age;
        private String area;
        private String card;
        private String level;
        private String nickname;
        private String role;
        private String sex;
        private String title;
        private Long user_id;

        @Override
        public String toString() {
            return "Sender{" +
                    "age=" + age +
                    ", area='" + area + '\'' +
                    ", card='" + card + '\'' +
                    ", level='" + level + '\'' +
                    ", nickname='" + nickname + '\'' +
                    ", role='" + role + '\'' +
                    ", sex='" + sex + '\'' +
                    ", title='" + title + '\'' +
                    ", user_id=" + user_id +
                    '}';
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getCard() {
            return card;
        }

        public void setCard(String card) {
            this.card = card;
        }

        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Long getUser_id() {
            return user_id;
        }

        public void setUser_id(Long user_id) {
            this.user_id = user_id;
        }
    }
}
