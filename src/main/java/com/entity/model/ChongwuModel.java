package com.entity.model;

import com.entity.ChongwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 宠物
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-16
 */
public class ChongwuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 宠物名称
     */
    private String chongwuName;


    /**
     * 宠物类别
     */
    private Integer chongwuTypes;


    /**
     * 性别
     */
    private Integer chongwuSexTypes;


    /**
     * 年龄
     */
    private String chongwuAge;


    /**
     * 花色
     */
    private String chongwuHuase;


    /**
     * 健康情况
     */
    private Integer chongwuJiankangTypes;


    /**
     * 所在地
     */
    private String chongwuSuozaidi;


    /**
     * 领养要求
     */
    private String chongwuLingyangyaoqiu;


    /**
     * 联系方式
     */
    private String chongwuLianxifangshi;


    /**
     * 宠物照片
     */
    private String chongwuPhoto;


    /**
     * 宠物详情
     */
    private String chongwuContent;


    /**
     * 是否被领养
     */
    private Integer chongwuYesnoTypes;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 获取：宠物名称
	 */
    public String getChongwuName() {
        return chongwuName;
    }


    /**
	 * 设置：宠物名称
	 */
    public void setChongwuName(String chongwuName) {
        this.chongwuName = chongwuName;
    }
    /**
	 * 获取：宠物类别
	 */
    public Integer getChongwuTypes() {
        return chongwuTypes;
    }


    /**
	 * 设置：宠物类别
	 */
    public void setChongwuTypes(Integer chongwuTypes) {
        this.chongwuTypes = chongwuTypes;
    }
    /**
	 * 获取：性别
	 */
    public Integer getChongwuSexTypes() {
        return chongwuSexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setChongwuSexTypes(Integer chongwuSexTypes) {
        this.chongwuSexTypes = chongwuSexTypes;
    }
    /**
	 * 获取：年龄
	 */
    public String getChongwuAge() {
        return chongwuAge;
    }


    /**
	 * 设置：年龄
	 */
    public void setChongwuAge(String chongwuAge) {
        this.chongwuAge = chongwuAge;
    }
    /**
	 * 获取：花色
	 */
    public String getChongwuHuase() {
        return chongwuHuase;
    }


    /**
	 * 设置：花色
	 */
    public void setChongwuHuase(String chongwuHuase) {
        this.chongwuHuase = chongwuHuase;
    }
    /**
	 * 获取：健康情况
	 */
    public Integer getChongwuJiankangTypes() {
        return chongwuJiankangTypes;
    }


    /**
	 * 设置：健康情况
	 */
    public void setChongwuJiankangTypes(Integer chongwuJiankangTypes) {
        this.chongwuJiankangTypes = chongwuJiankangTypes;
    }
    /**
	 * 获取：所在地
	 */
    public String getChongwuSuozaidi() {
        return chongwuSuozaidi;
    }


    /**
	 * 设置：所在地
	 */
    public void setChongwuSuozaidi(String chongwuSuozaidi) {
        this.chongwuSuozaidi = chongwuSuozaidi;
    }
    /**
	 * 获取：领养要求
	 */
    public String getChongwuLingyangyaoqiu() {
        return chongwuLingyangyaoqiu;
    }


    /**
	 * 设置：领养要求
	 */
    public void setChongwuLingyangyaoqiu(String chongwuLingyangyaoqiu) {
        this.chongwuLingyangyaoqiu = chongwuLingyangyaoqiu;
    }
    /**
	 * 获取：联系方式
	 */
    public String getChongwuLianxifangshi() {
        return chongwuLianxifangshi;
    }


    /**
	 * 设置：联系方式
	 */
    public void setChongwuLianxifangshi(String chongwuLianxifangshi) {
        this.chongwuLianxifangshi = chongwuLianxifangshi;
    }
    /**
	 * 获取：宠物照片
	 */
    public String getChongwuPhoto() {
        return chongwuPhoto;
    }


    /**
	 * 设置：宠物照片
	 */
    public void setChongwuPhoto(String chongwuPhoto) {
        this.chongwuPhoto = chongwuPhoto;
    }
    /**
	 * 获取：宠物详情
	 */
    public String getChongwuContent() {
        return chongwuContent;
    }


    /**
	 * 设置：宠物详情
	 */
    public void setChongwuContent(String chongwuContent) {
        this.chongwuContent = chongwuContent;
    }
    /**
	 * 获取：是否被领养
	 */
    public Integer getChongwuYesnoTypes() {
        return chongwuYesnoTypes;
    }


    /**
	 * 设置：是否被领养
	 */
    public void setChongwuYesnoTypes(Integer chongwuYesnoTypes) {
        this.chongwuYesnoTypes = chongwuYesnoTypes;
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
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
