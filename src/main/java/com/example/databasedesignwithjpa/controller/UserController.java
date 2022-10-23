package com.example.databasedesignwithjpa.controller;

import com.example.databasedesignwithjpa.model.User;
import com.example.databasedesignwithjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUsers")
    public ModelAndView getAllUsers() {
        ModelAndView mav = new ModelAndView("getUsers");
        List<User> allUsers = userService.getAllUsers();
        mav.addObject("users",allUsers);
        return mav;
    }

    @PostMapping("/user")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

   @PostMapping("/product/user")
    public String saveUserWithUI(@ModelAttribute User user) {
       Date date = new Date();
       String stringFormatter = "dd-MM-yy";
       SimpleDateFormat simpleDateFormat = new SimpleDateFormat(stringFormatter);
       String formattedString = simpleDateFormat.format(date);
       user.builder()
                .createdAt(formattedString)
                .build();
       userService.saveUser(user);
       return "redirect:/getUsers";
   }
}
