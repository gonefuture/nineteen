package cn.zhku.education.security;

import cn.zhku.education.dao.SecurityDao;
import cn.zhku.education.po.dao.PermissionMapper;
import cn.zhku.education.po.dao.PermissionRoleMapper;
import cn.zhku.education.po.dao.RoleUserMapper;
import cn.zhku.education.po.dao.UserMapper;
import cn.zhku.education.po.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 钱伟健 gonefutre
 * @date 2017/8/17 0:54.
 * @E-mail gonefuture@qq.com
 */
@Service
public class CustomUserService implements UserDetailsService {

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    UserMapper userMapper;
    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    PermissionRoleMapper permissionRoleMapper;
    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    RoleUserMapper roleUserMapper;
    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    PermissionMapper permissionMapper;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    SecurityDao securityDao;






    @Override
    public UserDetails loadUserByUsername(String username) {
        User user = securityDao.findByUserName(username);
        if (user != null) {
            List<Permission> permissions = securityDao.findByAdminUserId(user.getId());
            List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
            for (Permission permission : permissions) {
                if (permission != null && permission.getName()!=null) {

                    GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(permission.getName());
                    //1：此处将权限信息添加到 GrantedAuthority 对象中，在后面进行全权限验证时会使用GrantedAuthority 对象。
                    grantedAuthorities.add(grantedAuthority);
                }
            }
            return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), grantedAuthorities);
        } else {
            throw new UsernameNotFoundException("admin: " + username + " do not exist!");
        }
    }
}
