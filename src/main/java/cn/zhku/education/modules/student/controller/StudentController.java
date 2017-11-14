package cn.zhku.education.modules.student.controller;

import cn.zhku.education.model.CommonQo;
import cn.zhku.education.model.Message;
import cn.zhku.education.modules.student.dao.StudentDao;
import cn.zhku.education.pojo.dao.HistoryMapper;
import cn.zhku.education.pojo.dao.StudentMapper;
import cn.zhku.education.pojo.entity.History;
import cn.zhku.education.pojo.entity.HistoryExample;
import cn.zhku.education.pojo.entity.Student;
import cn.zhku.education.pojo.entity.StudentExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.UUID;

/**
 * @author : 钱伟健 gonefuture@qq.com
 * @version : 2017/11/12 23:03.
 * 说明：
 */
@RestController
public class StudentController {
    @Autowired
    StudentMapper studentMapper;

    @Autowired
    HistoryMapper historyMapper;

    @Autowired
    StudentDao studentDao;


    /**
     *  收集学生信息，开始游戏
     * @param student   学生信息
     * @param httpSession   当前session
     * @return  Message
     */
    @RequestMapping("/student/begin")
    public Message begin(Student student, HttpSession httpSession) {
        student.setScore(0);
        if (studentMapper.selectByPrimaryKey(student.getPhone()) != null){
            beginGame(httpSession,student);
            return new Message("1","欢迎继续游戏，为社会主义奉献！");
        }
        if (studentMapper.insert(student) == 1){
            beginGame(httpSession,student);
            return new Message("1","学生开始游戏成功");
        }
        else
            return new Message("2","学生开始游戏失败，请检查你输入的信息");
    }

    private void beginGame(HttpSession httpSession,Student student) {
        httpSession.setAttribute("student",student);
        History history = new History();
        history.setPhone(student.getPhone());
        history.setHid(UUID.randomUUID().toString().replace("-","").toUpperCase());
        historyMapper.insert(history);
        httpSession.setAttribute("history",history);
    }

    /**
     *  记录第一关成绩
     * @param score 成绩
     * @param httpSession   当前会话
     * @return message
     */
    @RequestMapping("/prePass")
    public Message prePass(Integer score,HttpSession httpSession) {
        if (score == null  || score  > 120)
            score = 0 ;
        Student studentSession = (Student) httpSession.getAttribute("student");
        History historySession = (History) httpSession.getAttribute("history");
        if ( studentSession == null || historySession == null)
            return new Message("2","请先完成前面的关卡");

        //  更新记录表
        History history = getScore(studentSession,historySession);
        history.setFirstScore(score);
        history.setPhone(studentSession.getPhone());
        history.setHid(history.getHid());

        //  更新学生记录
        Student student = new Student();
        student.setFirstScore(score);
        studentMapper.updateByPrimaryKeySelective(student);

        if (historyMapper.updateByPrimaryKeySelective(history) == 1)
            return new Message("1","记录第一关成绩成功");
        else
            return new Message("2","记录成绩失败");
    }


    /**
     *  记录最后一关的成绩
     * @param score 分数
     * @param httpSession   当前session
     * @return  Message
     */
    @RequestMapping("/lastPass")
    public Message lastPass(Integer score,HttpSession httpSession) {
        if (score == null || score > 500)
            score = 0 ;
        //  获取session中的对象
        Student studentSession = (Student) httpSession.getAttribute("student");
        History historySession = (History) httpSession.getAttribute("history");
        if ( studentSession == null || historySession == null)
            return new Message("2","请先完成前面的关卡");
        History history = getScore(studentSession,historySession);
        history.setHid(historySession.getHid());
        //  设置第二关分数
        history.setSecondScore(score);
        //  设置总分数
        int firstScore = historyMapper.selectByPrimaryKey(historySession.getHid()).getFirstScore();
        history.setScore( firstScore+ score);

        if (historyMapper.updateByPrimaryKeySelective(history) == 1){
            Student student = new Student();
            student.setSecondScore(score);
            student.setPhone(studentSession.getPhone());
            student.setScore(firstScore+score);
            studentMapper.updateByPrimaryKeySelective(student);
            return new Message("1","记录最后一关成绩成功");
        }
        else
            return new Message("2","记录成绩失败");
    }

    private History getScore(Student studentSession,History historySession) {
        History history = new History();
        history.setPhone(studentSession.getPhone());
        history.setHid(historySession.getHid());
        return history;
    }

    /**
     *  显示排名，默认是显示前十的排名
     * @param commonQo  通用查询类
     * @return
     */
    @RequestMapping("/student/rank")
    public PageInfo<Student> RankList(CommonQo commonQo) {
        PageHelper.startPage(commonQo.getPageNum(),commonQo.getPageSize(),"score");
        return new PageInfo<>(studentMapper.selectByExample(null));
    }


    /**
     *  展示所有学生
     * @param commonQo 通用查询类
     * @return PageInfo分页
     */
    @RequestMapping("/student/list")
    public PageInfo<Student> studentList(CommonQo commonQo) {
        PageHelper.startPage(commonQo.getPageNum(),commonQo.getPageSize());
        StudentExample studentExample = new StudentExample();
        return new PageInfo<>(studentMapper.selectByExample(studentExample));
    }


    /**
     *  查找当前玩家的游戏记录
     * @param commonQo 通用分页查询类
     * @param httpSession 当前会话
     * @return  pageInfo
     */
    @RequestMapping("/myhistory")
    public PageInfo<History> myHistory(CommonQo commonQo, HttpSession httpSession) {
        PageHelper.startPage(commonQo.getPageNum(),commonQo.getPageNum(),"htime");
        HistoryExample historyExample = new HistoryExample();
        Student studentSession = (Student) httpSession.getAttribute("student");
        historyExample.or().andPhoneEqualTo(studentSession.getPhone());
        return new PageInfo<>(historyMapper.selectByExample(historyExample));
    }


    /**
     *  查询学生信息
     * @param phone 手机号
     * @return  Student
     */
    @RequestMapping("student/{phone}")
    public Student myInfo(@PathVariable String phone){
        return studentMapper.selectByPrimaryKey(phone);
    }



    public Integer myRank() {
        return studentDao.myrank();
    }
}
