package cn.tedu.coolshark.service;

import cn.tedu.coolshark.model.Category;

import java.util.List;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/15 10:30
 */

public interface ICategoryService {
    List<Category> findAll();

    void deleteById(int id);
}
