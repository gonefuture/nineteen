package cn.zhku.education.modules.index;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 钱伟健 gonefutre
 * @date 2017/8/31 22:17.
 * @E-mail gonefuture@qq.com
 */
@Controller
public class IndexController {



    @RequestMapping("/home")
    public String home() {
        return "home";

    }


    @PreAuthorize("hasRole('user')")
    @RequestMapping(value = "/admin",method = RequestMethod.GET)
    @ResponseBody
    public String toAdmin(){

        return "helloAdmin";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";

    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

//    @RequestMapping("/")
//    public String root() {
//        return "index";
//
//    }

    @RequestMapping("/403")
    public String error(){
        return "403";
    }
}
