package cn.zhku.education.modules.student;

import cn.zhku.education.model.Message;
import cn.zhku.education.pojo.dao.StudentMapper;
import cn.zhku.education.pojo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author : 钱伟健 gonefuture@qq.com
 * @version : 2017/11/12 23:03.
 * 说明：
 */
@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    StudentMapper studentMapper;



    @RequestMapping("begin")

    public Message begin(Student student, HttpSession httpSession) {
        if (studentMapper.insert(student) == 1){
            httpSession.setAttribute("student",student);
            return new Message("1","学生开始游戏成功");
        }
        else
            return new Message("2","学生开始游戏失败，请检查你输入的信息");
    }


    public Message lastPass(Integer score,HttpSession httpSession) {
        Student studentSession = (Student) httpSession.getAttribute("student");
        Student student = new Student();
        student.setScore(score);

        if ( studentSession == null)
            return new Message("2","请先完成前面的关卡");
        student.setPhone(studentSession.getPhone());

        if (studentMapper.updateByPrimaryKey(student) == 1)
            return new Message("1","记录最后一关成绩成功");
        else
            return new Message("2","记录成绩失败");
    }



}
