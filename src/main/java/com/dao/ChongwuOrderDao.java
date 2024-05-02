package com.dao;

import com.entity.ChongwuOrderEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongwuOrderView;

/**
 * 宠物领养订单 Dao 接口
 *
 * @author 
 * @since 2021-04-16
 */
public interface ChongwuOrderDao extends BaseMapper<ChongwuOrderEntity> {

   List<ChongwuOrderView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
