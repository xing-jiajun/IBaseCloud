package com.ibasecloud.oauth.common.table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 用户角色关联 实体类
 *
 * @author 幸佳俊
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TbUserRole {

    /** 用户id */
    private String id;

    /** 用户id（tb_user） */
    private String userId;

    /** 角色id（tb_role） */
    private String roleId;

}
