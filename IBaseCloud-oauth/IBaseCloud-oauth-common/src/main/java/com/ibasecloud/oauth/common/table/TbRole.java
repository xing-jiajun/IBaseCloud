package com.ibasecloud.oauth.common.table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 角色 实体类
 *
 * @author 幸佳俊
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TbRole {

    /** 用户id */
    private String id;

    /** 角色名称 */
    private String name;

}
