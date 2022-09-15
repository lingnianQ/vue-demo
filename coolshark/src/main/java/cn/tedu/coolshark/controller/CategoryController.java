package cn.tedu.coolshark.controller;

import cn.tedu.coolshark.model.Category;
import cn.tedu.coolshark.model.Result;
import cn.tedu.coolshark.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/15 10:30
 */

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    @GetMapping("/select")
    public List<Category> select() {
        return categoryService.findAll();
    }

    @GetMapping("/delete")
    public Result delete(int id) {
        categoryService.deleteById(id);
        return new Result(200, "删除成功");
    }

    @PostMapping("/update")
    public Result update(@RequestBody Category category) {

        return categoryService.update(category);
    }

    @GetMapping("/insert")
    public List<Category> insert(String name) {
        categoryService.insert(name);
        return categoryService.findAll();
    }
}
