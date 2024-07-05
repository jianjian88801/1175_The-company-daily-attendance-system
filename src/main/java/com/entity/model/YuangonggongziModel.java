package com.entity.model;

import com.entity.YuangonggongziEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 员工工资
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-20 16:37:02
 */
public class YuangonggongziModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 员工工号
	 */
	
	private String yuangonggonghao;
		
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
		
	/**
	 * 部门
	 */
	
	private String bumen;
		
	/**
	 * 基本工资
	 */
	
	private Integer jibengongzi;
		
	/**
	 * 加班工资
	 */
	
	private Integer jiabangongzi;
		
	/**
	 * 请假扣除
	 */
	
	private Integer qingjiakouchu;
		
	/**
	 * 迟到早退扣除
	 */
	
	private Integer chidaozaotuikouchu;
		
	/**
	 * 旷工扣除
	 */
	
	private Integer kuanggongkouchu;
		
	/**
	 * 扣款原因
	 */
	
	private String koukuanyuanyin;
		
	/**
	 * 实发工资
	 */
	
	private Integer shifagongzi;
		
	/**
	 * 登记日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjiriqi;
				
	
	/**
	 * 设置：员工工号
	 */
	 
	public void setYuangonggonghao(String yuangonggonghao) {
		this.yuangonggonghao = yuangonggonghao;
	}
	
	/**
	 * 获取：员工工号
	 */
	public String getYuangonggonghao() {
		return yuangonggonghao;
	}
				
	
	/**
	 * 设置：员工姓名
	 */
	 
	public void setYuangongxingming(String yuangongxingming) {
		this.yuangongxingming = yuangongxingming;
	}
	
	/**
	 * 获取：员工姓名
	 */
	public String getYuangongxingming() {
		return yuangongxingming;
	}
				
	
	/**
	 * 设置：部门
	 */
	 
	public void setBumen(String bumen) {
		this.bumen = bumen;
	}
	
	/**
	 * 获取：部门
	 */
	public String getBumen() {
		return bumen;
	}
				
	
	/**
	 * 设置：基本工资
	 */
	 
	public void setJibengongzi(Integer jibengongzi) {
		this.jibengongzi = jibengongzi;
	}
	
	/**
	 * 获取：基本工资
	 */
	public Integer getJibengongzi() {
		return jibengongzi;
	}
				
	
	/**
	 * 设置：加班工资
	 */
	 
	public void setJiabangongzi(Integer jiabangongzi) {
		this.jiabangongzi = jiabangongzi;
	}
	
	/**
	 * 获取：加班工资
	 */
	public Integer getJiabangongzi() {
		return jiabangongzi;
	}
				
	
	/**
	 * 设置：请假扣除
	 */
	 
	public void setQingjiakouchu(Integer qingjiakouchu) {
		this.qingjiakouchu = qingjiakouchu;
	}
	
	/**
	 * 获取：请假扣除
	 */
	public Integer getQingjiakouchu() {
		return qingjiakouchu;
	}
				
	
	/**
	 * 设置：迟到早退扣除
	 */
	 
	public void setChidaozaotuikouchu(Integer chidaozaotuikouchu) {
		this.chidaozaotuikouchu = chidaozaotuikouchu;
	}
	
	/**
	 * 获取：迟到早退扣除
	 */
	public Integer getChidaozaotuikouchu() {
		return chidaozaotuikouchu;
	}
				
	
	/**
	 * 设置：旷工扣除
	 */
	 
	public void setKuanggongkouchu(Integer kuanggongkouchu) {
		this.kuanggongkouchu = kuanggongkouchu;
	}
	
	/**
	 * 获取：旷工扣除
	 */
	public Integer getKuanggongkouchu() {
		return kuanggongkouchu;
	}
				
	
	/**
	 * 设置：扣款原因
	 */
	 
	public void setKoukuanyuanyin(String koukuanyuanyin) {
		this.koukuanyuanyin = koukuanyuanyin;
	}
	
	/**
	 * 获取：扣款原因
	 */
	public String getKoukuanyuanyin() {
		return koukuanyuanyin;
	}
				
	
	/**
	 * 设置：实发工资
	 */
	 
	public void setShifagongzi(Integer shifagongzi) {
		this.shifagongzi = shifagongzi;
	}
	
	/**
	 * 获取：实发工资
	 */
	public Integer getShifagongzi() {
		return shifagongzi;
	}
				
	
	/**
	 * 设置：登记日期
	 */
	 
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
	}
			
}
