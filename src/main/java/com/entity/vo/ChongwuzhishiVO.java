package com.entity.vo;

import com.entity.ChongwuzhishiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 宠物知识科普
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-16
 */
@TableName("chongwuzhishi")
public class ChongwuzhishiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 宠物知识科普详情
     */

    @TableField(value = "chongwuzhishi_content")
    private String chongwuzhishiContent;


    /**
     * 创建时间 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show2 nameShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
