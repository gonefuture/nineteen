package cn.zhku.education.modules.student.model;

import cn.zhku.education.pojo.entity.Student;

/**
 * @author : 钱伟健 gonefuture@qq.com
 * @version : 2017/11/14 20:29.
 * 说明：
 */
public class StudentRankVo extends Student{
    private Integer rownum;

    public Integer getRownum() {
        return rownum;
    }

    public void setRownum(Integer rownum) {
        this.rownum = rownum;
    }

    @Override
    public String toString() {
        return "StudentRankVo{" +
                "rownum=" + rownum +
                '}';
    }
}
