package com.entity.view;

import com.entity.ChongwuzhishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 宠物知识科普
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-16
 */
@TableName("chongwuzhishi")
public class ChongwuzhishiView extends ChongwuzhishiEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 宠物科普知识类型的值
		*/
		private String chongwuzhishiValue;



	public ChongwuzhishiView() {

	}

	public ChongwuzhishiView(ChongwuzhishiEntity chongwuzhishiEntity) {
		try {
			BeanUtils.copyProperties(this, chongwuzhishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 宠物科普知识类型的值
			*/
			public String getChongwuzhishiValue() {
				return chongwuzhishiValue;
			}
			/**
			* 设置： 宠物科普知识类型的值
			*/
			public void setChongwuzhishiValue(String chongwuzhishiValue) {
				this.chongwuzhishiValue = chongwuzhishiValue;
			}










}
