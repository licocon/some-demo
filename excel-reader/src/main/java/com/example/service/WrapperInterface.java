package com.example.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

/**
 * @author licocon
 * @since 2023/1/29 17:12
 */
public interface WrapperInterface<T> {

    /**
     * 获取wrapper
     *
     * @return wrapper
     */
    default LambdaQueryWrapper<T> wrapper() {
        return Wrappers.lambdaQuery();
    }
}
