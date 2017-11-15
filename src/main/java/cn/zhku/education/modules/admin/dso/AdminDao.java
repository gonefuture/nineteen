package cn.zhku.education.modules.admin.dso;

import cn.zhku.education.pojo.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author : 钱伟健 gonefuture@qq.com
 * @version : 2017/11/15 14:53.
 * 说明：
 */
public interface AdminDao {

    @Select("select * from user  where username= #{username}")
    public User findByUserName(@Param("username") String username);
}
