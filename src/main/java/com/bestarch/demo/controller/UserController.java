package com.bestarch.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping(path = "/api")
//@CrossOrigin
public class UserController {

    @GetMapping(value = {"/", "/dashboard"})
    public ModelAndView dashboard(User user) {
    	ModelAndView mv = new ModelAndView("login");
        //User user = new User();
        mv.addObject(user);
        return mv;
    }
    
    @PostMapping(value = "/authenticate")
    public ModelAndView authenticate(User user, BindingResult result, Model model) {
    	ModelAndView mv = new ModelAndView("dashboard");
        mv.addObject(user);
        return mv;
    }
    
    @PostMapping(value = "/add-item")
    public ModelAndView addItem(User user, BindingResult result, Model model) {
    	ModelAndView mv = new ModelAndView("dashboard");
        mv.addObject(user);
        return mv;
    }

    @GetMapping(value = {"/cart"})
    public ModelAndView cart(User user) {
    	ModelAndView mv = new ModelAndView("cart");
        mv.addObject(user);
        return mv;
    }
    
    @GetMapping(value = {"/profile"})
    public ModelAndView profile(User user) {
    	ModelAndView mv = new ModelAndView("profile");
        mv.addObject(user);
        return mv;
    }
    
}
