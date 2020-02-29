package com.ai.autodriver.schedule;

import com.ai.autodriver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class timer {
    @Autowired
    UserService userService;

    @Scheduled(cron="0 08 16 * * ?")
    public void timerCron(){
        userService.getUserList();
    }
}
