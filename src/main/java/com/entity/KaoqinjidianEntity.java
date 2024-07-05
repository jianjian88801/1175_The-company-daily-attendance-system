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
 * 考勤基点
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-20 16:37:02
 */
@TableName("kaoqinjidian")
public class KaoqinjidianEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KaoqinjidianEntity() {
		
	}
	
	public KaoqinjidianEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 基点编号
	 */
					
	private String jidianbianhao;
	
	/**
	 * 基点名称
	 */
					
	private String jidianmingcheng;
	
	/**
	 * 基点地址
	 */
					
	private String jidiandizhi;
	
	/**
	 * 时间点
	 */
					
	private String shijiandian;
	
	/**
	 * 基点详情
	 */
					
	private String jidianxiangqing;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：基点编号
	 */
	public void setJidianbianhao(String jidianbianhao) {
		this.jidianbianhao = jidianbianhao;
	}
	/**
	 * 获取：基点编号
	 */
	public String getJidianbianhao() {
		return jidianbianhao;
	}
	/**
	 * 设置：基点名称
	 */
	public void setJidianmingcheng(String jidianmingcheng) {
		this.jidianmingcheng = jidianmingcheng;
	}
	/**
	 * 获取：基点名称
	 */
	public String getJidianmingcheng() {
		return jidianmingcheng;
	}
	/**
	 * 设置：基点地址
	 */
	public void setJidiandizhi(String jidiandizhi) {
		this.jidiandizhi = jidiandizhi;
	}
	/**
	 * 获取：基点地址
	 */
	public String getJidiandizhi() {
		return jidiandizhi;
	}
	/**
	 * 设置：时间点
	 */
	public void setShijiandian(String shijiandian) {
		this.shijiandian = shijiandian;
	}
	/**
	 * 获取：时间点
	 */
	public String getShijiandian() {
		return shijiandian;
	}
	/**
	 * 设置：基点详情
	 */
	public void setJidianxiangqing(String jidianxiangqing) {
		this.jidianxiangqing = jidianxiangqing;
	}
	/**
	 * 获取：基点详情
	 */
	public String getJidianxiangqing() {
		return jidianxiangqing;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}

}
