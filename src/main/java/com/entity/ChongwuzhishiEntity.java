package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 宠物知识科普
 *
 * @author 
 * @email
 * @date 2021-04-16
 */
@TableName("chongwuzhishi")
public class ChongwuzhishiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ChongwuzhishiEntity() {

	}

	public ChongwuzhishiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 宠物知识科普名称
     */
    @TableField(value = "chongwuzhishi_name")

    private String chongwuzhishiName;


    /**
     * 宠物科普知识类型
     */
    @TableField(value = "chongwuzhishi_types")

    private Integer chongwuzhishiTypes;


    /**
     * 宠物知识科普图片
     */
    @TableField(value = "chongwuzhishi_photo")

    private String chongwuzhishiPhoto;


    /**
     * 宠物知识科普时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 宠物知识科普详情
     */
    @TableField(value = "chongwuzhishi_content")

    private String chongwuzhishiContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：宠物知识科普名称
	 */
    public String getChongwuzhishiName() {
        return chongwuzhishiName;
    }


    /**
	 * 获取：宠物知识科普名称
	 */

    public void setChongwuzhishiName(String chongwuzhishiName) {
        this.chongwuzhishiName = chongwuzhishiName;
    }
    /**
	 * 设置：宠物科普知识类型
	 */
    public Integer getChongwuzhishiTypes() {
        return chongwuzhishiTypes;
    }


    /**
	 * 获取：宠物科普知识类型
	 */

    public void setChongwuzhishiTypes(Integer chongwuzhishiTypes) {
        this.chongwuzhishiTypes = chongwuzhishiTypes;
    }
    /**
	 * 设置：宠物知识科普图片
	 */
    public String getChongwuzhishiPhoto() {
        return chongwuzhishiPhoto;
    }


    /**
	 * 获取：宠物知识科普图片
	 */

    public void setChongwuzhishiPhoto(String chongwuzhishiPhoto) {
        this.chongwuzhishiPhoto = chongwuzhishiPhoto;
    }
    /**
	 * 设置：宠物知识科普时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：宠物知识科普时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：宠物知识科普详情
	 */
    public String getChongwuzhishiContent() {
        return chongwuzhishiContent;
    }


    /**
	 * 获取：宠物知识科普详情
	 */

    public void setChongwuzhishiContent(String chongwuzhishiContent) {
        this.chongwuzhishiContent = chongwuzhishiContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Chongwuzhishi{" +
            "id=" + id +
            ", chongwuzhishiName=" + chongwuzhishiName +
            ", chongwuzhishiTypes=" + chongwuzhishiTypes +
            ", chongwuzhishiPhoto=" + chongwuzhishiPhoto +
            ", insertTime=" + insertTime +
            ", chongwuzhishiContent=" + chongwuzhishiContent +
            ", createTime=" + createTime +
        "}";
    }
}
