package cn.zhku.education.modules.question.dao;

import cn.zhku.education.pojo.entity.Question;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author : 钱伟健 gonefuture@qq.com
 * @version : 2017/11/13 13:34.
 * 说明：有关question表的数据库查询接口
 */
public interface QuestionDao {

    @Select("SELECT * FROM `question`  AS t1 JOIN (SELECT ROUND(RAND() * (SELECT MAX(id) FROM `question`)) AS id) AS t2 WHERE t1.id >= t2.id " +
            " ORDER BY t1.id ASC LIMIT #{number}")
    public List<Question> randomQuestion(int number);

}
