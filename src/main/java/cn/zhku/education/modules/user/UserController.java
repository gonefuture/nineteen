package cn.zhku.education.modules.user;



import cn.zhku.education.pojo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 钱伟健 gonefutre
 * @date 2017/8/16 17:44.
 * @E-mail gonefuture@qq.com
 */

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("user/list")
    @ResponseBody
    public List<User> userList () {
        return userService.findList();
    }

}
