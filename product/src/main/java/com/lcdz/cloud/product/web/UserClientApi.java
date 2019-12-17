package com.lcdz.cloud.product.web;

import com.lcdz.cloud.apis.feign.UserClient;
import com.lcdz.cloud.apis.feign.UserClientFallback;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author QinZhenGuo
 * @date 2019/12/12 10:46
 */

@FeignClient(name = "user")
public interface UserClientApi extends UserClient {


}
