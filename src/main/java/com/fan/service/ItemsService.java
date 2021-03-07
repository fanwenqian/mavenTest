package com.fan.service;

import com.fan.domain.Items;

/**
 * @author fans
 */
public interface ItemsService {

    /**
     * 通过id查找
     *
     * @param id itemId
     * @return Items对象
     */
    public Items findById(Integer id);
}
