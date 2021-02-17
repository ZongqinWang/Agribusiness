package com.wtt.agribusiness.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wtt.common.utils.PageUtils;
import com.wtt.agribusiness.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author Wang TianTian
 * @email 442301197@qq.com
 * @date 2021-02-17 13:52:30
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

