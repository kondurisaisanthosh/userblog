package com.demo.userblog.controller;

import com.demo.userblog.service.HomeService;
import com.demo.userblog.service.ScreenServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "home/")
public class HomeConroller {

    @Autowired
    HomeService homeService;
    @Autowired
    ScreenServiceImpl screenService;
    @RequestMapping(value = "screen1", method = RequestMethod.GET)
    public String getHomeScreen(){
        homeService.print();
        screenService.setScreenName("Sai");
        System.out.println(screenService.getScreenName());
        return "Hello World";
    }

}
