package com.oj.onlinejudge.controller;

import com.oj.onlinejudge.entity.Subject;
import com.oj.onlinejudge.entity.User;
import com.oj.onlinejudge.model.SubjectModel;
import com.oj.onlinejudge.service.SubjectService;
import com.oj.onlinejudge.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Controller Rest
 *
 * @author CHNxindong
 * @date 2020/3/1
 */
@RestController
@RequestMapping(value = "/restApi/*")
public class Rest {
    @Autowired
    private UserService userService;

    @Autowired
    private SubjectService subjectService;

    @RequestMapping(value = "userLogin", method = RequestMethod.GET)
    @ApiOperation(value = "登录", notes = "登录")
    public String userLogin(HttpServletResponse response, @ApiParam("uid") @RequestParam("uid")Integer uid, @ApiParam("name") @RequestParam("name")String name) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setDateHeader("Expires", 0);
        response.setHeader("Access-Control-Allow-Methods", "GET");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,content-type");

        return userService.userLogin(uid, name);
    }

    /**
     * 前端传入：json格式  {"name":"de","sex":"male"}
     */
    @RequestMapping(value = "userRegister", method = RequestMethod.POST)
    @ApiOperation(value = "学生注册", notes = "学生注册")
    public String userRegister(HttpServletResponse response, @ApiParam("user") @RequestBody User user) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setDateHeader("Expires", 0);
        response.setHeader("Access-Control-Allow-Methods", "GET");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,content-type");

        return userService.userRegister(user);
    }

    @RequestMapping(value = "getUserList", method = RequestMethod.GET)
    @ApiOperation(value = "获取用户信息列表", notes = "全部用户信息")
    public List<User> getUserList(HttpServletResponse response) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setDateHeader("Expires", 0);
        response.setHeader("Access-Control-Allow-Methods", "GET");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,content-type");

        return userService.getUserList();
    }

    @RequestMapping(value = "getSubjectList", method = RequestMethod.GET)
    @ApiOperation(value = "获取题目列表(当uid不为空时，返回该用户的题目列表)", notes = "获取题目列表(当uid不为空时，返回该用户的题目列表)")
    public List<Subject> getSubjectList(HttpServletResponse response, @ApiParam("uid") @RequestParam("uid")Integer uid) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setDateHeader("Expires", 0);
        response.setHeader("Access-Control-Allow-Methods", "GET");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,content-type");

        if(uid != null){
            return subjectService.getSubjectListByUid(uid);
        }else{
            return subjectService.getSubjectList();
        }

    }

    @RequestMapping(value = "getSubjectBySid", method = RequestMethod.GET)
    @ApiOperation(value = "根据题目id获取题目详情", notes = "根据题目id获取题目详情")
    public Subject getSubjectBySid(HttpServletResponse response, @ApiParam("sid") @RequestParam("sid")Integer sid) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setDateHeader("Expires", 0);
        response.setHeader("Access-Control-Allow-Methods", "GET");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,content-type");

        return subjectService.getSubjectBySid(sid);
    }

    @RequestMapping(value = "getUserByUid", method = RequestMethod.GET)
    @ApiOperation(value = "根据用户id获取个人信息", notes = "根据用户id获取个人信息")
    public User getUserByUid(HttpServletResponse response, @ApiParam("uid") @RequestParam("uid")Integer uid) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setDateHeader("Expires", 0);
        response.setHeader("Access-Control-Allow-Methods", "GET");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,content-type");

        return userService.getUserByUid(uid);
    }

    /**
     * 例子json：注：json中类是{}，list用数组[{},{}]。key-value中的key是body类中的subject,testcaselist。
     * {
     * 	"subject":{"title":"sub7","describle":"desc8","difficulty":9},
     * 	"testcaseList":[{"sid":1,"caseName":"ca3","caseResult":"2"},{"sid":1,"caseName":"ca4","caseResult":"3"}]
     * }
     * @param response
     * @param subjectModel
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "insertSubject", method = RequestMethod.POST)
    @ApiOperation(value = "新增题目", notes = "新增题目")
    public String insertSubject(HttpServletResponse response, @ApiParam("subject") @RequestBody SubjectModel subjectModel) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setDateHeader("Expires", 0);
        response.setHeader("Access-Control-Allow-Methods", "GET");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,content-type");

        return subjectService.insertSubject(subjectModel);
    }

    @RequestMapping(value = "submit", method = RequestMethod.GET)
    @ApiOperation(value = "提交代码并判定", notes = "提交代码并判定")
    public String submit(HttpServletResponse response, @ApiParam("sid") @RequestParam("sid")Integer sid, @ApiParam("uid") @RequestParam("uid")Integer uid, @ApiParam("answer") @RequestParam("answer")String answer) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setDateHeader("Expires", 0);
        response.setHeader("Access-Control-Allow-Methods", "GET");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,content-type");

        return subjectService.submit(sid, uid, answer);
    }

    @RequestMapping(value = "deleteUserByUid", method = RequestMethod.GET)
    @ApiOperation(value = "删除用户", notes = "删除用户")
    public String deleteUserByUid(HttpServletResponse response, @ApiParam("uid") @RequestParam("uid")Integer uid) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setDateHeader("Expires", 0);
        response.setHeader("Access-Control-Allow-Methods", "GET");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,content-type");

        return userService.deleteUserByUid(uid);
    }

    @RequestMapping(value = "deleteSubjectBySid", method = RequestMethod.GET)
    @ApiOperation(value = "删除题目", notes = "删除题目")
    public String deleteSubjectBySid(HttpServletResponse response, @ApiParam("sid") @RequestParam("sid")Long sid) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setDateHeader("Expires", 0);
        response.setHeader("Access-Control-Allow-Methods", "GET");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,content-type");

        return subjectService.deleteSubjectBySid(sid);
    }
}
