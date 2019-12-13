package com.lcdz.cloud.product;

import com.lcdz.cloud.apis.feign.UserClient;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author QinZhenGuo
 * @date 2019/12/12 10:46
 */

@FeignClient(name = "user-server")
public interface UserClientApi extends UserClient {

}
