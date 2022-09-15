package cn.tedu.coolshark.controller;

import cn.tedu.coolshark.model.Banner;
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

    @GetMapping("/select")
    public List<Banner> select() {
        return bannerService.findAll();
    }

}
