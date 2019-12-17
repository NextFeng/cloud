package com.lcdz.cloud.apis.feign;

import org.springframework.stereotype.Component;

/**
 * @author QinZhenGuo
 * @date 2019/12/11 15:40
 */

@Component
public class UserClientFallback implements UserClient {

    @Override
    public String get(String msg) {
        return "发生服务降级" + msg;
    }
}
