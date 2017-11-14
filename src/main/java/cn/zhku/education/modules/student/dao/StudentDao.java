package cn.zhku.education.modules.student.dao;

import cn.zhku.education.modules.student.model.StudentRankVo;
import cn.zhku.education.pojo.entity.Student;
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
    @Select("SELECT * FROM ( " +
            "SELECT (@rownum:=@rownum+1) AS rownum, a.* FROM `student` a, (SELECT @rownum:= 0 ) r  ORDER BY a.`score` DESC  " +
            ") AS b  WHERE phone = #{phone}")
    StudentRankVo myrank(String phone);

}
