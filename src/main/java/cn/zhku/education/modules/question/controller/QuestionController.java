package cn.zhku.education.modules.question.controller;

import cn.zhku.education.model.CommonQo;
import cn.zhku.education.modules.question.dao.QuestionDao;
import cn.zhku.education.pojo.dao.QuestionMapper;
import cn.zhku.education.pojo.entity.Question;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : 钱伟健 gonefuture@qq.com
 * @version : 2017/11/12 23:04.
 * 说明：
 */

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionMapper questionMapper;

    @Autowired
    QuestionDao questionDao;

    @RequestMapping("list")
    public List<Question> list(Integer number) {
        if (number == null)
            number = 5;
        List<Question> questionList = questionDao.randomQuestion(number);
        return questionList;
    }
}
