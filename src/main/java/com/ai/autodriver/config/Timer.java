package com.ai.autodriver.config;

import com.ai.autodriver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Schedule Timer
 *
 * @author CHNxindong
 * @date 2020/3/1
 */
@Component
public class Timer {
    @Autowired
    UserService userService;

    @Scheduled(cron="0 08 16 * * ?")
    public void timerCron(){
        userService.getUserList();
    }
}
