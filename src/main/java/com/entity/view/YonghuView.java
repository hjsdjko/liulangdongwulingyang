package com.entity.view;

import com.entity.YonghuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-16
 */
@TableName("yonghu")
public class YonghuView extends YonghuEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 性别的值
		*/
		private String yonghuSexValue;
		/**
		* 是否养过宠物的值
		*/
		private String yonghuYesnoValue;



	public YonghuView() {

	}

	public YonghuView(YonghuEntity yonghuEntity) {
		try {
			BeanUtils.copyProperties(this, yonghuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 性别的值
			*/
			public String getYonghuSexValue() {
				return yonghuSexValue;
			}
			/**
			* 设置： 性别的值
			*/
			public void setYonghuSexValue(String yonghuSexValue) {
				this.yonghuSexValue = yonghuSexValue;
			}
			/**
			* 获取： 是否养过宠物的值
			*/
			public String getYonghuYesnoValue() {
				return yonghuYesnoValue;
			}
			/**
			* 设置： 是否养过宠物的值
			*/
			public void setYonghuYesnoValue(String yonghuYesnoValue) {
				this.yonghuYesnoValue = yonghuYesnoValue;
			}










}
