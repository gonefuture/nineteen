package cn.zhku.education.modules.user;

import cn.zhku.education.po.dao.UserMapper;
import cn.zhku.education.po.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 钱伟健 gonefutre
 * @date 2017/8/16 18:37.
 * @E-mail gonefuture@qq.com
 */

@Service
public class UserService {
    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    UserMapper userMapper;

    public List<User> findList() {
        return userMapper.selectByExample(null);
    }

}
