package cn.zhku.education.security.dao;


import cn.zhku.education.pojo.entity.Permission;
import cn.zhku.education.pojo.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 钱伟健 gonefutre
 * @date 2017/9/3 11:46.
 * @E-mail gonefuture@qq.com
 */
public interface SecurityDao {
    @Select("select * from user  where username= #{username}")
    public User findByUserName(@Param("username") String username);

    @Select(" select p.* " +
            "        from User u " +
            "        LEFT JOIN role_user ru on u.id= ru.User_id  " +
            "        LEFT JOIN Role r on ru.Role_id=r.id " +
            "        LEFT JOIN permission_role pr on pr.role_id=r.id  " +
            "        LEFT JOIN permission p on p.id =pr.permission_id  " +
            "        where u.id=#{userId} ")
    public List<Permission> findByAdminUserId(@Param("userId") Integer id);

    @Select(" SELECT * from permission ")
    public List<Permission> findAll();
}
