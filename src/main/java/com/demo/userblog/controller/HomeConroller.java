package com.demo.userblog.controller;

import com.demo.userblog.service.HomeService;
import com.demo.userblog.service.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "home/")
@Slf4j
public class HomeConroller {

    @Autowired
    @Qualifier("home")
    HomeService homeService;
    @Autowired
    @Qualifier("screen")
    ServiceImpl screenService;
    @RequestMapping(value = "screen", method = RequestMethod.GET)
    public String getHomeScreen(){
        homeService.print();
        screenService.setScreenName("Sai Santhosh Konduri");
        log.info(screenService.getScreenName());
        return "Hello World Sai Santhosh!!";
    }

}
