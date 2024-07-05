package com.entity.model;

import com.entity.KaoqinjidianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 考勤基点
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-20 16:37:02
 */
public class KaoqinjidianModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
