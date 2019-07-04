package com.codegym.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class SandwichController {
    @GetMapping( value = "/save")
    public String showForm(  Model model)
    {
        return "SandwichCondiments";
    }
    @PostMapping( value = "/save")
    public String save(@RequestParam String condiment, Model model)
    {
        model.addAttribute("condiment",condiment);
        return "SandwichCondiments";
    }
}
