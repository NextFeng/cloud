package com.lcdz.cloud.user.web;

import com.lcdz.cloud.user.feign.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author QinZhenGuo
 * @date 2019/12/11 10:34
 */

@RestController
@Slf4j
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/get")
    private String get(HttpServletRequest request){
        String ss = request.getParameter("msg");
        String str = userService.get(ss);
        return str;
    }



}
