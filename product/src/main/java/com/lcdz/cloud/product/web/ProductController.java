package com.lcdz.cloud.product.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author QinZhenGuo
 * @date 2019/12/11 11:38
 */

@RestController
@Slf4j
@RequestMapping("/")
public class ProductController {


    @Resource
    private UserClientApi userClientApi;

    @RequestMapping("/get")
    private String get(HttpServletRequest request){
        String ss = request.getParameter("msg");
        String str = userClientApi.get(ss);
        return str;
    }


}
