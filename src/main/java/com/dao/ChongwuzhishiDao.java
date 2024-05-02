package com.dao;

import com.entity.ChongwuzhishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongwuzhishiView;

/**
 * 宠物知识科普 Dao 接口
 *
 * @author 
 * @since 2021-04-16
 */
public interface ChongwuzhishiDao extends BaseMapper<ChongwuzhishiEntity> {

   List<ChongwuzhishiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
