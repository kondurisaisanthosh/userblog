package com.demo.userblog.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("home")
public class HomeService implements ServiceImpl{
    String homeScreenName;
    public void print(){
        System.out.println("I am in HomeService class");
    }

    @Override
    public void setScreenName(String name) {
        homeScreenName = "Home "+name;
    }

    @Override
    public String getScreenName() {
        return homeScreenName;
    }
}
