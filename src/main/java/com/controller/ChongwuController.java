package com.controller;


import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.StringUtil;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;

import com.entity.ChongwuEntity;

import com.service.ChongwuService;
import com.entity.view.ChongwuView;
import com.service.YonghuService;
import com.entity.YonghuEntity;

import com.utils.PageUtils;
import com.utils.R;

/**
 * 宠物
 * 后端接口
 * @author
 * @email
 * @date 2021-04-16
*/
@RestController
@Controller
@RequestMapping("/chongwu")
public class ChongwuController {
    private static final Logger logger = LoggerFactory.getLogger(ChongwuController.class);

    @Autowired
    private ChongwuService chongwuService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;



    //级联表service
    @Autowired
    private YonghuService yonghuService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isNotEmpty(role) && "用户".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }
        params.put("orderBy","id");
        PageUtils page = chongwuService.queryPage(params);

        //字典表数据转换
        List<ChongwuView> list =(List<ChongwuView>)page.getList();
        for(ChongwuView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ChongwuEntity chongwu = chongwuService.selectById(id);
        if(chongwu !=null){
            //entity转view
            ChongwuView view = new ChongwuView();
            BeanUtils.copyProperties( chongwu , view );//把实体数据重构到view中

            //级联表
            YonghuEntity yonghu = yonghuService.selectById(chongwu.getYonghuId());
            if(yonghu != null){
                BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setYonghuId(yonghu.getId());
            }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody ChongwuEntity chongwu, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,chongwu:{}",this.getClass().getName(),chongwu.toString());
        Wrapper<ChongwuEntity> queryWrapper = new EntityWrapper<ChongwuEntity>()
            .eq("chongwu_name", chongwu.getChongwuName())
            .eq("chongwu_types", chongwu.getChongwuTypes())
            .eq("chongwu_sex_types", chongwu.getChongwuSexTypes())
            .eq("chongwu_age", chongwu.getChongwuAge())
            .eq("chongwu_huase", chongwu.getChongwuHuase())
            .eq("chongwu_jiankang_types", chongwu.getChongwuJiankangTypes())
            .eq("chongwu_suozaidi", chongwu.getChongwuSuozaidi())
            .eq("chongwu_lingyangyaoqiu", chongwu.getChongwuLingyangyaoqiu())
            .eq("chongwu_lianxifangshi", chongwu.getChongwuLianxifangshi())
            .eq("chongwu_yesno_types", chongwu.getChongwuYesnoTypes())
            .eq("yonghu_id", chongwu.getYonghuId())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ChongwuEntity chongwuEntity = chongwuService.selectOne(queryWrapper);
        if(chongwuEntity==null){
            chongwu.setCreateTime(new Date());
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      chongwu.set
        //  }
            chongwuService.insert(chongwu);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ChongwuEntity chongwu, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,chongwu:{}",this.getClass().getName(),chongwu.toString());
        //根据字段查询是否有相同数据
        Wrapper<ChongwuEntity> queryWrapper = new EntityWrapper<ChongwuEntity>()
            .notIn("id",chongwu.getId())
            .andNew()
            .eq("chongwu_name", chongwu.getChongwuName())
            .eq("chongwu_types", chongwu.getChongwuTypes())
            .eq("chongwu_sex_types", chongwu.getChongwuSexTypes())
            .eq("chongwu_age", chongwu.getChongwuAge())
            .eq("chongwu_huase", chongwu.getChongwuHuase())
            .eq("chongwu_jiankang_types", chongwu.getChongwuJiankangTypes())
            .eq("chongwu_suozaidi", chongwu.getChongwuSuozaidi())
            .eq("chongwu_lingyangyaoqiu", chongwu.getChongwuLingyangyaoqiu())
            .eq("chongwu_lianxifangshi", chongwu.getChongwuLianxifangshi())
            .eq("chongwu_yesno_types", chongwu.getChongwuYesnoTypes())
            .eq("yonghu_id", chongwu.getYonghuId())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ChongwuEntity chongwuEntity = chongwuService.selectOne(queryWrapper);
        if("".equals(chongwu.getChongwuPhoto()) || "null".equals(chongwu.getChongwuPhoto())){
                chongwu.setChongwuPhoto(null);
        }
        if(chongwuEntity==null){
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      chongwu.set
            //  }
            chongwuService.updateById(chongwu);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        chongwuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }



    /**
    * 前端列表
    */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        /*String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isNotEmpty(role) && "用户".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }*/
        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        params.put("chongwuYesnoTypes",2);
        PageUtils page = chongwuService.queryPage(params);

        //字典表数据转换
        List<ChongwuView> list =(List<ChongwuView>)page.getList();
        for(ChongwuView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ChongwuEntity chongwu = chongwuService.selectById(id);
            if(chongwu !=null){
                //entity转view
        ChongwuView view = new ChongwuView();
                BeanUtils.copyProperties( chongwu , view );//把实体数据重构到view中

                //级联表
                    YonghuEntity yonghu = yonghuService.selectById(chongwu.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody ChongwuEntity chongwu, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,chongwu:{}",this.getClass().getName(),chongwu.toString());
        Wrapper<ChongwuEntity> queryWrapper = new EntityWrapper<ChongwuEntity>()
            .eq("chongwu_name", chongwu.getChongwuName())
            .eq("chongwu_types", chongwu.getChongwuTypes())
            .eq("chongwu_sex_types", chongwu.getChongwuSexTypes())
            .eq("chongwu_age", chongwu.getChongwuAge())
            .eq("chongwu_huase", chongwu.getChongwuHuase())
            .eq("chongwu_jiankang_types", chongwu.getChongwuJiankangTypes())
            .eq("chongwu_suozaidi", chongwu.getChongwuSuozaidi())
            .eq("chongwu_lingyangyaoqiu", chongwu.getChongwuLingyangyaoqiu())
            .eq("chongwu_lianxifangshi", chongwu.getChongwuLianxifangshi())
            .eq("chongwu_yesno_types", chongwu.getChongwuYesnoTypes())
            .eq("yonghu_id", chongwu.getYonghuId())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
    ChongwuEntity chongwuEntity = chongwuService.selectOne(queryWrapper);
        if(chongwuEntity==null){
            chongwu.setCreateTime(new Date());
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      chongwu.set
        //  }
        chongwuService.insert(chongwu);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


}

