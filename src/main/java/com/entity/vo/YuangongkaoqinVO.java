package com.entity.vo;

import com.entity.YuangongkaoqinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 员工考勤
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-20 16:37:02
 */
public class YuangongkaoqinVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 员工姓名
	 */
	
	private String yuangongxingming;
		
	/**
	 * 部门
	 */
	
	private String bumen;
		
	/**
	 * 类型
	 */
	
	private String leixing;
		
	/**
	 * 考勤基点
	 */
	
	private String kaoqinjidian;
		
	/**
	 * 考勤时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaoqinshijian;
				
	
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
	 * 设置：类型
	 */
	 
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	
	/**
	 * 获取：类型
	 */
	public String getLeixing() {
		return leixing;
	}
				
	
	/**
	 * 设置：考勤基点
	 */
	 
	public void setKaoqinjidian(String kaoqinjidian) {
		this.kaoqinjidian = kaoqinjidian;
	}
	
	/**
	 * 获取：考勤基点
	 */
	public String getKaoqinjidian() {
		return kaoqinjidian;
	}
				
	
	/**
	 * 设置：考勤时间
	 */
	 
	public void setKaoqinshijian(Date kaoqinshijian) {
		this.kaoqinshijian = kaoqinshijian;
	}
	
	/**
	 * 获取：考勤时间
	 */
	public Date getKaoqinshijian() {
		return kaoqinshijian;
	}
			
}
