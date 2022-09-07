package com.example.boot01.controller;

import com.example.boot01.entity.Product;
import com.example.boot01.service.IProductService;
import com.example.boot01.utils.DBUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/7 10:42
 */
@RestController
public class ProductController {
    @Autowired
    private IProductService productService;


    @RequestMapping("/update")
    public String update(Product product) {
        System.out.println(product);
        try (Connection conn = DBUtils.getConnection();) {
            String sql = "update t_product set title=?,price=?,num=? where id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, product.getTitle());
            ps.setDouble(2, product.getPrice());
            ps.setInt(3, product.getNum());
            ps.setInt(4, product.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "修改成功";
    }


    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        productService.deleteById(id);
        return "删除成功";
    }

    @RequestMapping("/select")
    public List<Product> select() {
        return productService.findAll();
    }


    @RequestMapping("/select1")
    public List<Product> select1() {
        List<Product> list = new ArrayList<>();
        try (Connection conn = DBUtils.getConnection()) {
            String sql = "select * from t_product";
            PreparedStatement ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product product = new Product(rs.getInt(1), rs.getString(2),
                        rs.getDouble(3), rs.getInt(4));
                list.add(product);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }


    @RequestMapping("/insert1")
    public String insert1(Product product) {

        try (Connection conn = DBUtils.getConnection()) {
            String sql = "insert into t_product values(null,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, product.getTitle());
            ps.setDouble(2, product.getPrice());
            ps.setInt(3, product.getNum());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return "添加完成";
    }


    @RequestMapping("/insert")
    public String insert(Product product) {

        if (product.getTitle().isEmpty()) {

            return "添加失败,标题不能为空";
        }
        productService.add(product);
        return "添加完成";
    }


}
