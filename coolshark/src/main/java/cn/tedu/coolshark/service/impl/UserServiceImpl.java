package cn.tedu.coolshark.service.impl;

import cn.tedu.coolshark.mapper.UserMapper;
import cn.tedu.coolshark.model.Result;
import cn.tedu.coolshark.model.User;
import cn.tedu.coolshark.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/15 9:39
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Result selectByUsername(String name, String password) {

        User user = userMapper.selectByUserName(name);
        if (user == null) {
            return new Result(404, "用户不存在");
        }
        if (user.getPassword().equals(password)) {
            return new Result(200, "登录成功");
        }

        return new Result(500, "密码错误");
    }
}
