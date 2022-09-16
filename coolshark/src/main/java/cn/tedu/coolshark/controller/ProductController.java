package cn.tedu.coolshark.controller;

import cn.tedu.coolshark.model.Product;
import cn.tedu.coolshark.model.Result;
import cn.tedu.coolshark.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/15 17:21
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;

    @PostMapping("/insert")
    public Result insert(@RequestBody Product product){
        productService.insert(product);
        return new Result(200,"添加产品成功");
    }
    @GetMapping("/select")
    public List<Product> select() {
        return productService.findAll();
    }

    @GetMapping("/delete")
    public Result delete(int id) {
        productService.deleteById(id);
        return new Result(200, "产品删除成功");
    }
}
