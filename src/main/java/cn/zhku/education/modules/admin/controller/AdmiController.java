package cn.zhku.education.modules.admin.controller;

import cn.zhku.education.model.CommonQo;
import cn.zhku.education.model.Message;
import cn.zhku.education.modules.admin.dso.AdminDao;
import cn.zhku.education.pojo.dao.StudentMapper;
import cn.zhku.education.pojo.dao.UserMapper;
import cn.zhku.education.pojo.entity.Student;
import cn.zhku.education.pojo.entity.StudentExample;
import cn.zhku.education.pojo.entity.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author : 钱伟健 gonefuture@qq.com
 * @version : 2017/11/15 12:01.
 * 说明：游戏后台管理系统
 */
@Controller
public class AdmiController {
    @Autowired
    UserMapper userMapper;

    @Autowired
    StudentMapper studentMapper;

    @Autowired
    AdminDao adminDao;


    @RequestMapping("/admin/login")
    public String login(User form, HttpSession httpSession) {
        User user = adminDao.findByUserName(form.getUsername());
        if (user == null)
            return "404.html";
        else {
            httpSession.setAttribute("user",user);
            return "/admin/userList.html";
        }
    }



    /**
     *  展示所有学生
     * @param commonQo 通用查询类
     * @return PageInfo分页
     */
    @ResponseBody
    @RequestMapping("/student/list")
    public PageInfo<Student> studentList(CommonQo commonQo,HttpSession httpSession) {
//        User user = (User) httpSession.getAttribute("user");
//        if (user == null)
//            return null;
        PageHelper.startPage(commonQo.getPageNum(),commonQo.getPageSize(),"score desc");
        StudentExample studentExample = new StudentExample();
        return new PageInfo<>(studentMapper.selectByExample(studentExample));
    }


}
