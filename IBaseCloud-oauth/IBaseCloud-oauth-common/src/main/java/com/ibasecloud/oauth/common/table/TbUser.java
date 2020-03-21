package com.ibasecloud.oauth.common.table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 用户 实体类
 *
 * @author 幸佳俊
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TbUser {

    /** 用户id */
    private String id;

    /** 账户 */
    private String username;

    /** 密码 */
    private String password;

    /** 用户状态（0正常、1禁用、99注销） */
    private Integer status;
}
