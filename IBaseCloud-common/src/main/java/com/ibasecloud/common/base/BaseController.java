package com.ibasecloud.common.base;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 基础控制器
 *
 * @param <T>
 */
public abstract class BaseController<T> {

    /** 具体服务 */
    public abstract BaseService<T> getService();

}
