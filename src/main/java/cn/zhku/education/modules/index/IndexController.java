package cn.zhku.education.modules.index;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


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



    @RequestMapping("/login")
    public String login(){
        return "login";
    }


    @RequestMapping("/403")
    public String error(){
        return "403";
    }
}
