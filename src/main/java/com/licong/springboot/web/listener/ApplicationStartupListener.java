package com.licong.springboot.web.listener;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by lctm2005 on 2015/9/4.
 */
public class ApplicationStartupListener implements ApplicationListener<ApplicationStartedEvent> {
    public void onApplicationEvent(ApplicationStartedEvent event) {
        System.out.println("App Start:" + event);
    }
}
