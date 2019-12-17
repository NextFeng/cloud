package com.lcdz.cloud.product.web;

import org.springframework.stereotype.Component;

/**
 * @author LinFeng
 * @date 2019/12/18 0:36
 */

@Component
public class UserClientApiFallBack implements UserClientApi{


    @Override
    public String get(String msg) {
        return "你妹的,服务降级了" + msg;
    }
}
