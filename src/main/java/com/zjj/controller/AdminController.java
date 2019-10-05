package com.zjj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: znsh
 * @description: 后台管理控制器
 * @author: zjj
 * @create: 2019年7月15日20:50:20
 **/
@Controller
public class AdminController {
    @RequestMapping("/{parameter}")
    public String parameter(@PathVariable("parameter") String parameter) {
        return parameter;
    }



}
