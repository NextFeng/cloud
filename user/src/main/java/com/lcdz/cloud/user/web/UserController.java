package com.lcdz.cloud.user.web;

import com.lcdz.cloud.user.feign.UserService;
import com.lcdz.cloud.user.tools.GirlConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

import static java.lang.Thread.sleep;

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



    @Autowired
    private GirlConfig girlConfig;


    @RequestMapping("/get")
    private String get(HttpServletRequest request) throws Exception{
        String ss = request.getParameter("msg");
        sleep(3000);
        String str = userService.get(ss);
        return str;
    }

    @RequestMapping("/print")
    private String print(HttpServletRequest request){
        String name = girlConfig.getName();
        Integer age = girlConfig.getAge();
        return "姓名：" + name + ",年龄：" + age;
    }



}
