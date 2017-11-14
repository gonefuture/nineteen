package cn.zhku.education.pojo.entity;

import java.io.Serializable;
import java.util.Date;

public class History implements Serializable {
    private String hid;

    private String phone;

    private Integer firstScore;

    private Integer secondScore;

    private Date htime;

    private Integer score;

    private Integer hrate;

    private static final long serialVersionUID = 1L;

    public String getHid() {
        return hid;
    }

    public void setHid(String hid) {
        this.hid = hid == null ? null : hid.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getFirstScore() {
        return firstScore;
    }

    public void setFirstScore(Integer firstScore) {
        this.firstScore = firstScore;
    }

    public Integer getSecondScore() {
        return secondScore;
    }

    public void setSecondScore(Integer secondScore) {
        this.secondScore = secondScore;
    }

    public Date getHtime() {
        return htime;
    }

    public void setHtime(Date htime) {
        this.htime = htime;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getHrate() {
        return hrate;
    }

    public void setHrate(Integer hrate) {
        this.hrate = hrate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", hid=").append(hid);
        sb.append(", phone=").append(phone);
        sb.append(", firstScore=").append(firstScore);
        sb.append(", secondScore=").append(secondScore);
        sb.append(", htime=").append(htime);
        sb.append(", score=").append(score);
        sb.append(", hrate=").append(hrate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}