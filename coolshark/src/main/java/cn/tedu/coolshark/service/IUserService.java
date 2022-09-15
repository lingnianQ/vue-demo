package cn.tedu.coolshark.service;

import cn.tedu.coolshark.model.Result;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/15 9:38
 */

public interface IUserService {
    Result selectByUsername(String name, String password);
}
