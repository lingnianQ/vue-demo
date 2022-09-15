package cn.tedu.coolshark.service.impl;

import cn.tedu.coolshark.model.Result;
import cn.tedu.coolshark.service.IUploadService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/15 16:01
 */
@Service
public class UploadServiceImpl implements IUploadService {
    @Override
    public Result upload(MultipartFile pic) throws IOException {
        //得到唯一文件名
        String filename = pic.getOriginalFilename();
        //得到后缀名
        String suffix = filename.substring(filename.lastIndexOf("."));
        filename = UUID.randomUUID() + suffix;
        //准备保存图片文件夹的路径
        String dirPath = "d:/files";
        File dirFile = new File(dirPath);
        if (!dirFile.exists()) {
            dirFile.mkdirs();
        }
        String filePath = dirPath + "/" + filename;
        pic.transferTo(new File(filePath));

        return new Result(200,"/" + filename);
    }
}
