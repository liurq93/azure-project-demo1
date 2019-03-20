package com.liurq.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liurq on 2017/7/26.
 */
@RestController
public class TestController {

    @RequestMapping(value = "/index")
    public String index() {
        return "你好，弈阁!";
    }

    @RequestMapping(value = "/login")
    public String login(@RequestParam String username, @RequestParam String password) {

        if ("chenxue".equals(username) && "1124".equals(password)) {
            return "登陆成功,欢迎" + username;
        } else if (!"chenxue".equals(username)) {
            return "用户名不正确，请重新输入";
        } else if ("1124".equals(password)) {
            return "密码有误";
        }
        return "你好，Spring Boot!";
    }
}
