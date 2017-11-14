package cn.zhku.education.modules.student.dao;

import org.apache.ibatis.annotations.Select;

/**
 * @author : 钱伟健 gonefuture@qq.com
 * @version : 2017/11/14 18:42.
 * 说明： 学生表的数据库接口
 */
public interface StudentDao {

    /**
     *  查找排名
     * @return  排名
     */
    @Select(" SELECT (SELECT COUNT(s.score)+1 FROM student s WHERE s.score>t.score) rank FROM student t ORDER BY t.score DESC")
    Integer myrank();

}
