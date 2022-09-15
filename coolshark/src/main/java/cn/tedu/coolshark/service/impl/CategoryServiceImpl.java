package cn.tedu.coolshark.service.impl;

import cn.tedu.coolshark.mapper.CategoryMapper;
import cn.tedu.coolshark.model.Category;
import cn.tedu.coolshark.model.Result;
import cn.tedu.coolshark.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/15 10:31
 */
@Service
public class CategoryServiceImpl implements ICategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    public List<Category> findAll() {
        return categoryMapper.findAll();
    }

    @Override
    public void deleteById(int id) {
        categoryMapper.deleteById(id);
    }

    @Override
    public void insert(String name) {
        categoryMapper.insert(name);
    }

    @Override
    public Result update(Category category) {
        categoryMapper.update(category);
        return new Result(200,"更新名称成功");
    }
}
