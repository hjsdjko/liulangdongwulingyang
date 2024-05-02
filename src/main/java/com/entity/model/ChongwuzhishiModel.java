package com.entity.model;

import com.entity.ChongwuzhishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 宠物知识科普
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-16
 */
public class ChongwuzhishiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 宠物知识科普名称
     */
    private String chongwuzhishiName;


    /**
     * 宠物科普知识类型
     */
    private Integer chongwuzhishiTypes;


    /**
     * 宠物知识科普图片
     */
    private String chongwuzhishiPhoto;


    /**
     * 宠物知识科普时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 宠物知识科普详情
     */
    private String chongwuzhishiContent;


    /**
     * 创建时间 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：宠物知识科普名称
	 */
    public String getChongwuzhishiName() {
        return chongwuzhishiName;
    }


    /**
	 * 设置：宠物知识科普名称
	 */
    public void setChongwuzhishiName(String chongwuzhishiName) {
        this.chongwuzhishiName = chongwuzhishiName;
    }
    /**
	 * 获取：宠物科普知识类型
	 */
    public Integer getChongwuzhishiTypes() {
        return chongwuzhishiTypes;
    }


    /**
	 * 设置：宠物科普知识类型
	 */
    public void setChongwuzhishiTypes(Integer chongwuzhishiTypes) {
        this.chongwuzhishiTypes = chongwuzhishiTypes;
    }
    /**
	 * 获取：宠物知识科普图片
	 */
    public String getChongwuzhishiPhoto() {
        return chongwuzhishiPhoto;
    }


    /**
	 * 设置：宠物知识科普图片
	 */
    public void setChongwuzhishiPhoto(String chongwuzhishiPhoto) {
        this.chongwuzhishiPhoto = chongwuzhishiPhoto;
    }
    /**
	 * 获取：宠物知识科普时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：宠物知识科普时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：宠物知识科普详情
	 */
    public String getChongwuzhishiContent() {
        return chongwuzhishiContent;
    }


    /**
	 * 设置：宠物知识科普详情
	 */
    public void setChongwuzhishiContent(String chongwuzhishiContent) {
        this.chongwuzhishiContent = chongwuzhishiContent;
    }
    /**
	 * 获取：创建时间 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show2 nameShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
