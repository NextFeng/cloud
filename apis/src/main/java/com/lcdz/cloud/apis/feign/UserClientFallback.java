package com.lcdz.cloud.apis.feign;

import org.springframework.stereotype.Service;

/**
 * @author QinZhenGuo
 * @date 2019/12/11 15:40
 */

@Service
public class UserClientFallback implements UserClient {

    @Override
    public String get(String msg) {
        return "发生服务降级" + msg;
    }
}
