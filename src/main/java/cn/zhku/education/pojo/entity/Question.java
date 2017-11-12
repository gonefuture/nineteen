package cn.zhku.education.pojo.entity;

import java.io.Serializable;

public class Question implements Serializable {
    private Integer id;

    private String qtype;

    private String qcontent;

    private String a;

    private String b;

    private String c;

    private String d;

    private String answer;

    private String qexplain;

    private Integer qvalue;

    private String entertime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQtype() {
        return qtype;
    }

    public void setQtype(String qtype) {
        this.qtype = qtype == null ? null : qtype.trim();
    }

    public String getQcontent() {
        return qcontent;
    }

    public void setQcontent(String qcontent) {
        this.qcontent = qcontent == null ? null : qcontent.trim();
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a == null ? null : a.trim();
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b == null ? null : b.trim();
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c == null ? null : c.trim();
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d == null ? null : d.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public String getQexplain() {
        return qexplain;
    }

    public void setQexplain(String qexplain) {
        this.qexplain = qexplain == null ? null : qexplain.trim();
    }

    public Integer getQvalue() {
        return qvalue;
    }

    public void setQvalue(Integer qvalue) {
        this.qvalue = qvalue;
    }

    public String getEntertime() {
        return entertime;
    }

    public void setEntertime(String entertime) {
        this.entertime = entertime == null ? null : entertime.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", qtype=").append(qtype);
        sb.append(", qcontent=").append(qcontent);
        sb.append(", a=").append(a);
        sb.append(", b=").append(b);
        sb.append(", c=").append(c);
        sb.append(", d=").append(d);
        sb.append(", answer=").append(answer);
        sb.append(", qexplain=").append(qexplain);
        sb.append(", qvalue=").append(qvalue);
        sb.append(", entertime=").append(entertime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}