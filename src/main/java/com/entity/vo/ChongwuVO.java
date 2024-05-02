package com.entity.vo;

import com.entity.ChongwuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 宠物
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-16
 */
@TableName("chongwu")
public class ChongwuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 宠物名称
     */

    @TableField(value = "chongwu_name")
    private String chongwuName;


    /**
     * 宠物类别
     */

    @TableField(value = "chongwu_types")
    private Integer chongwuTypes;


    /**
     * 性别
     */

    @TableField(value = "chongwu_sex_types")
    private Integer chongwuSexTypes;


    /**
     * 年龄
     */

    @TableField(value = "chongwu_age")
    private String chongwuAge;


    /**
     * 花色
     */

    @TableField(value = "chongwu_huase")
    private String chongwuHuase;


    /**
     * 健康情况
     */

    @TableField(value = "chongwu_jiankang_types")
    private Integer chongwuJiankangTypes;


    /**
     * 所在地
     */

    @TableField(value = "chongwu_suozaidi")
    private String chongwuSuozaidi;


    /**
     * 领养要求
     */

    @TableField(value = "chongwu_lingyangyaoqiu")
    private String chongwuLingyangyaoqiu;


    /**
     * 联系方式
     */

    @TableField(value = "chongwu_lianxifangshi")
    private String chongwuLianxifangshi;


    /**
     * 宠物照片
     */

    @TableField(value = "chongwu_photo")
    private String chongwuPhoto;


    /**
     * 宠物详情
     */

    @TableField(value = "chongwu_content")
    private String chongwuContent;


    /**
     * 是否被领养
     */

    @TableField(value = "chongwu_yesno_types")
    private Integer chongwuYesnoTypes;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 设置：宠物名称
	 */
    public String getChongwuName() {
        return chongwuName;
    }


    /**
	 * 获取：宠物名称
	 */

    public void setChongwuName(String chongwuName) {
        this.chongwuName = chongwuName;
    }
    /**
	 * 设置：宠物类别
	 */
    public Integer getChongwuTypes() {
        return chongwuTypes;
    }


    /**
	 * 获取：宠物类别
	 */

    public void setChongwuTypes(Integer chongwuTypes) {
        this.chongwuTypes = chongwuTypes;
    }
    /**
	 * 设置：性别
	 */
    public Integer getChongwuSexTypes() {
        return chongwuSexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setChongwuSexTypes(Integer chongwuSexTypes) {
        this.chongwuSexTypes = chongwuSexTypes;
    }
    /**
	 * 设置：年龄
	 */
    public String getChongwuAge() {
        return chongwuAge;
    }


    /**
	 * 获取：年龄
	 */

    public void setChongwuAge(String chongwuAge) {
        this.chongwuAge = chongwuAge;
    }
    /**
	 * 设置：花色
	 */
    public String getChongwuHuase() {
        return chongwuHuase;
    }


    /**
	 * 获取：花色
	 */

    public void setChongwuHuase(String chongwuHuase) {
        this.chongwuHuase = chongwuHuase;
    }
    /**
	 * 设置：健康情况
	 */
    public Integer getChongwuJiankangTypes() {
        return chongwuJiankangTypes;
    }


    /**
	 * 获取：健康情况
	 */

    public void setChongwuJiankangTypes(Integer chongwuJiankangTypes) {
        this.chongwuJiankangTypes = chongwuJiankangTypes;
    }
    /**
	 * 设置：所在地
	 */
    public String getChongwuSuozaidi() {
        return chongwuSuozaidi;
    }


    /**
	 * 获取：所在地
	 */

    public void setChongwuSuozaidi(String chongwuSuozaidi) {
        this.chongwuSuozaidi = chongwuSuozaidi;
    }
    /**
	 * 设置：领养要求
	 */
    public String getChongwuLingyangyaoqiu() {
        return chongwuLingyangyaoqiu;
    }


    /**
	 * 获取：领养要求
	 */

    public void setChongwuLingyangyaoqiu(String chongwuLingyangyaoqiu) {
        this.chongwuLingyangyaoqiu = chongwuLingyangyaoqiu;
    }
    /**
	 * 设置：联系方式
	 */
    public String getChongwuLianxifangshi() {
        return chongwuLianxifangshi;
    }


    /**
	 * 获取：联系方式
	 */

    public void setChongwuLianxifangshi(String chongwuLianxifangshi) {
        this.chongwuLianxifangshi = chongwuLianxifangshi;
    }
    /**
	 * 设置：宠物照片
	 */
    public String getChongwuPhoto() {
        return chongwuPhoto;
    }


    /**
	 * 获取：宠物照片
	 */

    public void setChongwuPhoto(String chongwuPhoto) {
        this.chongwuPhoto = chongwuPhoto;
    }
    /**
	 * 设置：宠物详情
	 */
    public String getChongwuContent() {
        return chongwuContent;
    }


    /**
	 * 获取：宠物详情
	 */

    public void setChongwuContent(String chongwuContent) {
        this.chongwuContent = chongwuContent;
    }
    /**
	 * 设置：是否被领养
	 */
    public Integer getChongwuYesnoTypes() {
        return chongwuYesnoTypes;
    }


    /**
	 * 获取：是否被领养
	 */

    public void setChongwuYesnoTypes(Integer chongwuYesnoTypes) {
        this.chongwuYesnoTypes = chongwuYesnoTypes;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
