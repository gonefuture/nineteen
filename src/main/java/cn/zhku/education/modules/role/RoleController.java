package cn.zhku.education.modules.role;

import cn.zhku.education.po.dao.RoleMapper;
import cn.zhku.education.po.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 钱伟健 gonefutre
 * @date 2017/9/9 0:18.
 * @E-mail gonefuture@qq.com
 */
@RestController
public class RoleController {
    @Autowired
    RoleMapper roleMapper;

    @RequestMapping("role/list")
    public List<Role> roleList() {
        return roleMapper.selectByExample(null);
    }
}
