package com.lcdz.cloud.product.web;

import com.lcdz.cloud.apis.feign.UserClient;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author QinZhenGuo
 * @date 2019/12/12 10:46
 */

@FeignClient(name = "user",fallback = UserClientApiFallBack.class)
public interface UserClientApi extends UserClient {


}
