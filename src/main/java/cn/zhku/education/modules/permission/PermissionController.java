package cn.zhku.education.modules.permission;

import cn.zhku.education.po.dao.PermissionMapper;
import cn.zhku.education.po.entity.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 钱伟健 gonefutre
 * @date 2017/9/9 0:19.
 * @E-mail gonefuture@qq.com
 */
@RestController
public class PermissionController {
    @Autowired
    PermissionMapper permissionMapper;

    @RequestMapping("permission/list")
    public List<Permission> permissionList() {
        return  permissionMapper.selectByExample(null);
    }
}
