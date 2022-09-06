package com.example.boot01.controller;

import com.example.boot01.entity.BmiEmp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/6 17:15
 */
@Controller
public class BMIController {

    @RequestMapping("/bmi")
    @ResponseBody
    public String bmiE(BmiEmp bmiEmp) {
        double bmi = bmiEmp.getWeight() / (bmiEmp.getHeight() * bmiEmp.getHeight());
        String str = String.format("%.2f", bmi);
        double d = Double.parseDouble(str);
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
    }
}
