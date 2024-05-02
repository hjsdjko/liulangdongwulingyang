package com.entity.view;

import com.entity.ChongwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 宠物
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-16
 */
@TableName("chongwu")
public class ChongwuView extends ChongwuEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 宠物类别的值
		*/
		private String chongwuValue;
		/**
		* 性别的值
		*/
		private String chongwuSexValue;
		/**
		* 健康情况的值
		*/
		private String chongwuJiankangValue;
		/**
		* 是否被领养的值
		*/
		private String chongwuYesnoValue;



		//级联表 yonghu
			/**
			* 姓名
			*/
			private String yonghuName;
			/**
			* 性别
			*/
			private Integer yonghuSexTypes;
				/**
				* 性别的值
				*/
				private String yonghuSexValue;
			/**
			* 年龄
			*/
			private Integer yonghuAge;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 工作
			*/
			private String yonghuGongzuo;
			/**
			* 收入
			*/
			private Integer yonghuJine;
			/**
			* 家庭地址
			*/
			private String yonghuAddress;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 爱好
			*/
			private String yonghuAihao;
			/**
			* 是否养过宠物
			*/
			private Integer yonghuYesnoTypes;
				/**
				* 是否养过宠物的值
				*/
				private String yonghuYesnoValue;

	public ChongwuView() {

	}

	public ChongwuView(ChongwuEntity chongwuEntity) {
		try {
			BeanUtils.copyProperties(this, chongwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 宠物类别的值
			*/
			public String getChongwuValue() {
				return chongwuValue;
			}
			/**
			* 设置： 宠物类别的值
			*/
			public void setChongwuValue(String chongwuValue) {
				this.chongwuValue = chongwuValue;
			}
			/**
			* 获取： 性别的值
			*/
			public String getChongwuSexValue() {
				return chongwuSexValue;
			}
			/**
			* 设置： 性别的值
			*/
			public void setChongwuSexValue(String chongwuSexValue) {
				this.chongwuSexValue = chongwuSexValue;
			}
			/**
			* 获取： 健康情况的值
			*/
			public String getChongwuJiankangValue() {
				return chongwuJiankangValue;
			}
			/**
			* 设置： 健康情况的值
			*/
			public void setChongwuJiankangValue(String chongwuJiankangValue) {
				this.chongwuJiankangValue = chongwuJiankangValue;
			}
			/**
			* 获取： 是否被领养的值
			*/
			public String getChongwuYesnoValue() {
				return chongwuYesnoValue;
			}
			/**
			* 设置： 是否被领养的值
			*/
			public void setChongwuYesnoValue(String chongwuYesnoValue) {
				this.chongwuYesnoValue = chongwuYesnoValue;
			}
















				//级联表的get和set yonghu
					/**
					* 获取： 姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 性别
					*/
					public Integer getYonghuSexTypes() {
						return yonghuSexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setYonghuSexTypes(Integer yonghuSexTypes) {
						this.yonghuSexTypes = yonghuSexTypes;
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
					* 获取： 年龄
					*/
					public Integer getYonghuAge() {
						return yonghuAge;
					}
					/**
					* 设置： 年龄
					*/
					public void setYonghuAge(Integer yonghuAge) {
						this.yonghuAge = yonghuAge;
					}
					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 工作
					*/
					public String getYonghuGongzuo() {
						return yonghuGongzuo;
					}
					/**
					* 设置： 工作
					*/
					public void setYonghuGongzuo(String yonghuGongzuo) {
						this.yonghuGongzuo = yonghuGongzuo;
					}
					/**
					* 获取： 收入
					*/
					public Integer getYonghuJine() {
						return yonghuJine;
					}
					/**
					* 设置： 收入
					*/
					public void setYonghuJine(Integer yonghuJine) {
						this.yonghuJine = yonghuJine;
					}
					/**
					* 获取： 家庭地址
					*/
					public String getYonghuAddress() {
						return yonghuAddress;
					}
					/**
					* 设置： 家庭地址
					*/
					public void setYonghuAddress(String yonghuAddress) {
						this.yonghuAddress = yonghuAddress;
					}
					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 爱好
					*/
					public String getYonghuAihao() {
						return yonghuAihao;
					}
					/**
					* 设置： 爱好
					*/
					public void setYonghuAihao(String yonghuAihao) {
						this.yonghuAihao = yonghuAihao;
					}
					/**
					* 获取： 是否养过宠物
					*/
					public Integer getYonghuYesnoTypes() {
						return yonghuYesnoTypes;
					}
					/**
					* 设置： 是否养过宠物
					*/
					public void setYonghuYesnoTypes(Integer yonghuYesnoTypes) {
						this.yonghuYesnoTypes = yonghuYesnoTypes;
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
