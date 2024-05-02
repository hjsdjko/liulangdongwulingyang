package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChongwuOrderEntity;
import java.util.Map;

/**
 * 宠物领养订单 服务类
 * @author 
 * @since 2021-04-16
 */
public interface ChongwuOrderService extends IService<ChongwuOrderEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}