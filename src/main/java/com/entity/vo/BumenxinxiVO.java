package com.entity.vo;

import com.entity.BumenxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 部门信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-20 16:37:02
 */
public class BumenxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 部门名称
	 */
	
	private String bumenmingcheng;
		
	/**
	 * 部门介绍
	 */
	
	private String bumenjieshao;
				
	
	/**
	 * 设置：部门名称
	 */
	 
	public void setBumenmingcheng(String bumenmingcheng) {
		this.bumenmingcheng = bumenmingcheng;
	}
	
	/**
	 * 获取：部门名称
	 */
	public String getBumenmingcheng() {
		return bumenmingcheng;
	}
				
	
	/**
	 * 设置：部门介绍
	 */
	 
	public void setBumenjieshao(String bumenjieshao) {
		this.bumenjieshao = bumenjieshao;
	}
	
	/**
	 * 获取：部门介绍
	 */
	public String getBumenjieshao() {
		return bumenjieshao;
	}
			
}
