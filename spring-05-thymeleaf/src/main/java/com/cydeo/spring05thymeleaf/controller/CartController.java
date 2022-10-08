package com.cydeo.spring05thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cart")
public class CartController {


    @GetMapping("/create")
    public String createCart(Model model){



        return "/cart/show-cart";
    }
}
