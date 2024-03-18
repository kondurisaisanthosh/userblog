package com.demo.userblog.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("screen")
public class ScreenService implements ServiceImpl {
    String screenName = null;

    public void print(){
        System.out.println("I am in ScreenService class");
    }
    @Override
    public void setScreenName(String name) {
        screenName = "Screen "+name;
    }

    @Override
    public String getScreenName() {
        return screenName;
    }
}
