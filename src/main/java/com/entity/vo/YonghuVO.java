package com.entity.vo;

import com.entity.YonghuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 用户
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-16
 */
@TableName("yonghu")
public class YonghuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 账户
     */

    @TableField(value = "username")
    private String username;


    /**
     * 密码
     */

    @TableField(value = "password")
    private String password;


    /**
     * 姓名
     */

    @TableField(value = "yonghu_name")
    private String yonghuName;


    /**
     * 性别
     */

    @TableField(value = "yonghu_sex_types")
    private Integer yonghuSexTypes;


    /**
     * 年龄
     */

    @TableField(value = "yonghu_age")
    private Integer yonghuAge;


    /**
     * 用户头像
     */

    @TableField(value = "yonghu_photo")
    private String yonghuPhoto;


    /**
     * 工作
     */

    @TableField(value = "yonghu_gongzuo")
    private String yonghuGongzuo;


    /**
     * 收入
     */

    @TableField(value = "yonghu_jine")
    private Integer yonghuJine;


    /**
     * 家庭地址
     */

    @TableField(value = "yonghu_address")
    private String yonghuAddress;


    /**
     * 联系方式
     */

    @TableField(value = "yonghu_phone")
    private String yonghuPhone;


    /**
     * 身份证号
     */

    @TableField(value = "yonghu_id_number")
    private String yonghuIdNumber;


    /**
     * 爱好
     */

    @TableField(value = "yonghu_aihao")
    private String yonghuAihao;


    /**
     * 是否养过宠物
     */

    @TableField(value = "yonghu_yesno_types")
    private Integer yonghuYesnoTypes;


    /**
     * 创建时间
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
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：姓名
	 */
    public String getYonghuName() {
        return yonghuName;
    }


    /**
	 * 获取：姓名
	 */

    public void setYonghuName(String yonghuName) {
        this.yonghuName = yonghuName;
    }
    /**
	 * 设置：性别
	 */
    public Integer getYonghuSexTypes() {
        return yonghuSexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setYonghuSexTypes(Integer yonghuSexTypes) {
        this.yonghuSexTypes = yonghuSexTypes;
    }
    /**
	 * 设置：年龄
	 */
    public Integer getYonghuAge() {
        return yonghuAge;
    }


    /**
	 * 获取：年龄
	 */

    public void setYonghuAge(Integer yonghuAge) {
        this.yonghuAge = yonghuAge;
    }
    /**
	 * 设置：用户头像
	 */
    public String getYonghuPhoto() {
        return yonghuPhoto;
    }


    /**
	 * 获取：用户头像
	 */

    public void setYonghuPhoto(String yonghuPhoto) {
        this.yonghuPhoto = yonghuPhoto;
    }
    /**
	 * 设置：工作
	 */
    public String getYonghuGongzuo() {
        return yonghuGongzuo;
    }


    /**
	 * 获取：工作
	 */

    public void setYonghuGongzuo(String yonghuGongzuo) {
        this.yonghuGongzuo = yonghuGongzuo;
    }
    /**
	 * 设置：收入
	 */
    public Integer getYonghuJine() {
        return yonghuJine;
    }


    /**
	 * 获取：收入
	 */

    public void setYonghuJine(Integer yonghuJine) {
        this.yonghuJine = yonghuJine;
    }
    /**
	 * 设置：家庭地址
	 */
    public String getYonghuAddress() {
        return yonghuAddress;
    }


    /**
	 * 获取：家庭地址
	 */

    public void setYonghuAddress(String yonghuAddress) {
        this.yonghuAddress = yonghuAddress;
    }
    /**
	 * 设置：联系方式
	 */
    public String getYonghuPhone() {
        return yonghuPhone;
    }


    /**
	 * 获取：联系方式
	 */

    public void setYonghuPhone(String yonghuPhone) {
        this.yonghuPhone = yonghuPhone;
    }
    /**
	 * 设置：身份证号
	 */
    public String getYonghuIdNumber() {
        return yonghuIdNumber;
    }


    /**
	 * 获取：身份证号
	 */

    public void setYonghuIdNumber(String yonghuIdNumber) {
        this.yonghuIdNumber = yonghuIdNumber;
    }
    /**
	 * 设置：爱好
	 */
    public String getYonghuAihao() {
        return yonghuAihao;
    }


    /**
	 * 获取：爱好
	 */

    public void setYonghuAihao(String yonghuAihao) {
        this.yonghuAihao = yonghuAihao;
    }
    /**
	 * 设置：是否养过宠物
	 */
    public Integer getYonghuYesnoTypes() {
        return yonghuYesnoTypes;
    }


    /**
	 * 获取：是否养过宠物
	 */

    public void setYonghuYesnoTypes(Integer yonghuYesnoTypes) {
        this.yonghuYesnoTypes = yonghuYesnoTypes;
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

}
