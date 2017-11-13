package cn.zhku.education.pojo.entity;

import java.io.Serializable;

public class Student implements Serializable {
    private String phone;

    private String collegeClass;

    private String name;

    private Integer playtimes;

    private Integer score;

    private Integer lastRank;

    private static final long serialVersionUID = 1L;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getCollegeClass() {
        return collegeClass;
    }

    public void setCollegeClass(String collegeClass) {
        this.collegeClass = collegeClass == null ? null : collegeClass.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPlaytimes() {
        return playtimes;
    }

    public void setPlaytimes(Integer playtimes) {
        this.playtimes = playtimes;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getLastRank() {
        return lastRank;
    }

    public void setLastRank(Integer lastRank) {
        this.lastRank = lastRank;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", phone=").append(phone);
        sb.append(", collegeClass=").append(collegeClass);
        sb.append(", name=").append(name);
        sb.append(", playtimes=").append(playtimes);
        sb.append(", score=").append(score);
        sb.append(", lastRank=").append(lastRank);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}