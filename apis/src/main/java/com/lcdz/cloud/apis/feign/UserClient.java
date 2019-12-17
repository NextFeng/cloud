package com.lcdz.cloud.apis.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author QinZhenGuo
 * @date 2019/12/11 11:49
 */

@FeignClient(name = "user")
public interface UserClient {

    @GetMapping("/get")
    String get(@RequestParam("msg") String msg);

}
