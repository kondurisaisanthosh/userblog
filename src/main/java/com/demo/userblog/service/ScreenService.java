package com.demo.userblog.service;

import org.springframework.stereotype.Component;

@Component
public class ScreenService implements ScreenServiceImpl{
    String screenName = null;
    @Override
    public void setScreenName(String name) {
        screenName = name;
    }

    @Override
    public String getScreenName() {
        return screenName;
    }
}
