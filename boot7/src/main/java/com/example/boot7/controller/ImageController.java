package com.example.boot7.controller;

import com.example.boot7.entity.Image;
import com.example.boot7.mapper.ImageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.Arrays;
import java.util.List;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/13 14:43
 */

@RestController
public class ImageController {

    @Autowired
    private ImageMapper imageMapper;

    @RequestMapping("/del")
    public String delete(Integer id) {
        System.out.println("id = " + id);
        Image image = imageMapper.selectById(id);
        if (image == null) {
            return "图片不存在";
        }
        // 删除文件
        String[] urls = image.getUrls().split(",");
        System.out.println(Arrays.toString(urls));
        for (String url : urls) {
            new File("d:/files" + url).delete();
        }

        imageMapper.delById(id);
        return "1";
    }

    @RequestMapping("/insert")
    public String insert(@RequestBody Image image) {
        System.out.println("image = " + image);
        imageMapper.insert(image);
        return "1";
    }

    @RequestMapping("/select")
    public List<Image> select() {
        return imageMapper.select();
    }
}
