package com.example.weibo.controller;

import com.example.weibo.entity.User;
import com.example.weibo.entity.Weibo;
import com.example.weibo.mapper.WeiboMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/14 16:54
 */

@RestController
public class WeiboController {
    @Autowired
    private WeiboMapper weiboMapper;

    @RequestMapping("/weibo/insert")
    public int insert(@RequestBody Weibo weibo, HttpSession session) {
        weibo.setCreated(new Date());

        User user = (User) session.getAttribute("user");
        if (user == null) {
            return 2;//代表未登录
        }
        weibo.setUserId(user.getId());
        weibo.setNick(user.getNick());
        weiboMapper.insert(weibo);
        return 1;
    }

    @RequestMapping("/weibo/select")
    public List<Weibo> select(){
        return weiboMapper.select();
    }
    @RequestMapping("/weibo/selectById")
    public Weibo selectById(int id){
        System.out.println("id = " + id);
        return weiboMapper.selectById(id);
    }
}
