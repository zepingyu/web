package com.controller;

import com.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yzp on 17-7-31.
 */
@Controller
public class Usercontroller {

    @RequestMapping("/create")
    public String Create(Model model) {
        return "create";
    }

    // user:视图层传给控制层的表单对象；model：控制层返回给视图层的对象
    @RequestMapping("/save")
    public String Save(@ModelAttribute("form") User user, Model model) {
        model.addAttribute("user", user);
        return "detail";
    }

    @RequestMapping("/index")
    public String index( Model model) {
        return "index";
    }

    @RequestMapping("/index1")
    public String index1( Model model) {
        return "index";
    }
}
