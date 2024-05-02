package com.entity.model;

import com.entity.ChongwuLiuyanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 宠物留言
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-16
 */
public class ChongwuLiuyanModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 宠物
     */
    private Integer chongwuId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 留言内容
     */
    private String chongwuLiuyanContent;


    /**
     * 回复内容
     */
    private String replyContent;


    /**
     * 留言时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
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
	 * 获取：宠物
	 */
    public Integer getChongwuId() {
        return chongwuId;
    }


    /**
	 * 设置：宠物
	 */
    public void setChongwuId(Integer chongwuId) {
        this.chongwuId = chongwuId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：留言内容
	 */
    public String getChongwuLiuyanContent() {
        return chongwuLiuyanContent;
    }


    /**
	 * 设置：留言内容
	 */
    public void setChongwuLiuyanContent(String chongwuLiuyanContent) {
        this.chongwuLiuyanContent = chongwuLiuyanContent;
    }
    /**
	 * 获取：回复内容
	 */
    public String getReplyContent() {
        return replyContent;
    }


    /**
	 * 设置：回复内容
	 */
    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }
    /**
	 * 获取：留言时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：留言时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
