package cn.zhku.education.modules.index;

import cn.zhku.education.utils.beans.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 钱伟健 gonefutre
 * @date 2017/9/2 10:32.
 * @E-mail gonefuture@qq.com
 */
@Controller
public class HomeController {
//    @RequestMapping("/")
//    public String index(Model model){
//        Msg msg =  new Msg("测试标题","测试内容","欢迎来到HOME页面,您拥有 ROLE_HOME 权限");
//        model.addAttribute("msg", msg);
//
//        return "user/index";
//    }
    @RequestMapping("/admin")
    @ResponseBody
    public String hello(){
        return "hello admin";
    }

    @RequestMapping("/logout")
    public String logout(){
        return "login";
    }
}