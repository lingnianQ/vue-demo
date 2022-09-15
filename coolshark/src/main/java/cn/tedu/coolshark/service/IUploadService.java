package cn.tedu.coolshark.service;

import cn.tedu.coolshark.model.Result;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/15 16:01
 */

public interface IUploadService {
    Result upload(MultipartFile pic) throws IOException;
}
