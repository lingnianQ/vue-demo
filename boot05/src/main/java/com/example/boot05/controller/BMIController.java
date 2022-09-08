package com.example.boot05.controller;

import com.example.boot05.entity.BmiEmp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/6 17:15
 */
@RestController
public class BMIController {

    @RequestMapping("/bmi")
    public String bmiE(@RequestBody BmiEmp bmiEmp) {
        System.out.println(bmiEmp);
        double bmi = (bmiEmp.getWeight()) / (bmiEmp.getHeight() * bmiEmp.getHeight());
        System.out.println(bmi);
        String str = String.format("%.2f", bmi);
        System.out.println(str);
        double d = Double.parseDouble(str);
        System.out.println(d);
        if (d < 18.4) {
            return "bmi: " + d + " 瘦了";
        }
        if (d < 23.9) {
            return "bmi: " + d + " 正常";
        }
        if (d < 27.9) {
            return "bmi: " + d + " 微胖";
        }

        return "bmi: " + d + " 胖了";
//        return bmiEmp.toString();
    }
}
