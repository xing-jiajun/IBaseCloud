package com.ibasecloud.oauth.api;

import com.ibasecloud.common.constants.ApiContants;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户相关api
 *
 * @author 幸佳俊
 */
@RestController
@RequestMapping(value = ApiContants.SECURITY_API + "/user")
public class UserController {

    @GetMapping(value = "/test")
    public String test() {
        return "success";
    }

}
