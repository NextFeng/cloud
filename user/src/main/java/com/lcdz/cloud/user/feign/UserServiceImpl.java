package com.lcdz.cloud.user.feign;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author QinZhenGuo
 * @date 2019/12/11 10:28
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Override
    public String get(String msg) {
        log.info("【获取的是 ：】" + msg);
        return "来啦老弟" + msg;
    }

}
