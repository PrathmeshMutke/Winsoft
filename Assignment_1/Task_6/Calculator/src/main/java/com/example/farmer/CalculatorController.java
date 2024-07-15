package com.example.farmer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class CalculatorController {

    @GetMapping("/index")
    public String index() {
        return "index"; // Ensure this matches your index.html template name
    }

    @PostMapping("/calculate")
    public String calculate(@RequestParam("num1") int num1,
                            @RequestParam("num2") int num2,
                            @RequestParam("operation") String operation,
                            Model model) {
        double result = 0;
        switch (operation) {
            case "add":
                result = num1 + num2;
                break;
            case "subtract":
                result = num1 - num2;
                break;
            case "multiply":
                result = num1 * num2;
                break;
            case "divide":
                result = (double) num1 / num2;
                break;
        }
        model.addAttribute("result", result);
        return "result"; // Ensure this matches your result.html template name
    }
}


