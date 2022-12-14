package com.example.boot7.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
public class UploadController {
    @RequestMapping("/upload")
    public String upload(MultipartFile pic) throws IOException {
        System.out.println("pic = " + pic);
        //得到文件的原始文件名        a.jpg
        String fileName = pic.getOriginalFilename();
        System.out.println(fileName);
        //得到后缀   .jpg/.png
        String suffix = fileName.substring(fileName.lastIndexOf("."));
        System.out.println(suffix);
        //得到唯一文件名 UUID.randomUUID() 获取由16进制字符串组成的一个唯一标识符
        fileName = UUID.randomUUID() + suffix;
        System.out.println(fileName);
        //准备保存图片文件夹的路径
        String dirPath = "d:/files";
        File dirFile = new File(dirPath);
        //判断文件是否存在
        if (!dirFile.exists()) {
            //创建文件夹
            dirFile.mkdirs();
        }
        //得到保存图片的完整路径 e:/files/xxxx.jpg
        String filePath = dirPath + "/" + fileName;
        //把图片文件保存到指定的路径  异常抛出
        pic.transferTo(new File(filePath));


        return "/" + fileName;
    }

    @RequestMapping("/remove")
    public String remove(String url) {
        System.out.println("url------" + url);
        new File("d:/files" + url).delete();
        return "1";
    }
}
