package com.jiangfan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: 江帆
 * @Date: 2020/6/18
 * @Description: com.jiangfan.controller
 * @version: 1.0
 */
@RestController
public class UserController {
    @RequestMapping("/hello")
    public   String userHello() {

        return "helloWord";
    }


}
