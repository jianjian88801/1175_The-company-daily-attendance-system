package com.dao;

import com.entity.KaoqinjidianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KaoqinjidianVO;
import com.entity.view.KaoqinjidianView;


/**
 * 考勤基点
 * 
 * @author 
 * @email 
 * @date 2021-05-20 16:37:02
 */
public interface KaoqinjidianDao extends BaseMapper<KaoqinjidianEntity> {
	
	List<KaoqinjidianVO> selectListVO(@Param("ew") Wrapper<KaoqinjidianEntity> wrapper);
	
	KaoqinjidianVO selectVO(@Param("ew") Wrapper<KaoqinjidianEntity> wrapper);
	
	List<KaoqinjidianView> selectListView(@Param("ew") Wrapper<KaoqinjidianEntity> wrapper);

	List<KaoqinjidianView> selectListView(Pagination page,@Param("ew") Wrapper<KaoqinjidianEntity> wrapper);
	
	KaoqinjidianView selectView(@Param("ew") Wrapper<KaoqinjidianEntity> wrapper);
	
}
