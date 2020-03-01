package com.ai.autodriver.controller;

import com.ai.autodriver.service.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Controller Rest
 *
 * @author CHNxindong
 * @date 2020/3/1
 */
@RestController
@RequestMapping(value = "/userApi/*")
public class Rest {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "getUserList", method = RequestMethod.GET)
    @ApiOperation(value = "获取用户信息列表", notes = "全部用户信息")
    public Object getMusicList(HttpServletResponse response, @ApiParam(required = true, name = "name", value = "姓名")
    @RequestParam(name = "name", required = true) String stuName) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setDateHeader("Expires", 0);
        response.setHeader("Access-Control-Allow-Methods", "GET");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,content-type");

        return userService.getUserList();
    }
}
