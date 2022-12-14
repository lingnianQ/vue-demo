package cn.tedu.coolshark.controller;

import cn.tedu.coolshark.model.Banner;
import cn.tedu.coolshark.model.Result;
import cn.tedu.coolshark.service.IBannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/15 11:09
 */
@RestController
@RequestMapping("/banner")
public class BannerController {

    @Autowired
    private IBannerService bannerService;

    @GetMapping("/insert")
    public Result insert(String url){
        bannerService.insert(url);
        return new Result(200,"添加banner成功");
    }
    @GetMapping("/select")
    public List<Banner> select() {
        return bannerService.findAll();
    }

    @GetMapping("/delete")
    public Result delete(int id) {
        bannerService.deleteById(id);
        return new Result(200, "轮播图删除成功");
    }

}
