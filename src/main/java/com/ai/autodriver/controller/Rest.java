package com.ai.autodriver.controller;

import com.ai.autodriver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping(value="/userApi/*")
public class Rest {
    @Autowired
    private UserService userService;

    @RequestMapping(value="getUserList",method=RequestMethod.GET)
    public Object getMusicList(HttpServletResponse response) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setDateHeader("Expires", 0);
        response.setHeader("Access-Control-Allow-Methods","GET");
        response.setHeader("Access-Control-Allow-Headers","x-requested-with,content-type");

        return userService.getUserList();
    }
}
