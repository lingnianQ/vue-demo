package cn.tedu.coolshark.controller;

import cn.tedu.coolshark.model.Result;
import cn.tedu.coolshark.service.IUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/15 15:34
 */
@RestController
public class UploadController {
    @Autowired
    private IUploadService uploadService;

    @PostMapping("/upload")
    public Result upload(MultipartFile pic) throws IOException {

        return uploadService.upload(pic);
    }

    @GetMapping("/remove")
    public Result remove(String url) {
        new File("d:/files" + url).delete();
        return new Result(200, "移除成功");
    }
}
