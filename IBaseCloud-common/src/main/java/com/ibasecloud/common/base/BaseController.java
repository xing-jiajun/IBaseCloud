package com.ibasecloud.common.base;

/**
 * 基础控制器
 *
 * @param <T>
 */
public abstract class BaseController<T> {

    /** 具体服务 */
    public abstract BaseService<T> getService();

}
