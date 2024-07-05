package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuangongkaoqinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuangongkaoqinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuangongkaoqinView;


/**
 * 员工考勤
 *
 * @author 
 * @email 
 * @date 2021-05-20 16:37:02
 */
public interface YuangongkaoqinService extends IService<YuangongkaoqinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuangongkaoqinVO> selectListVO(Wrapper<YuangongkaoqinEntity> wrapper);
   	
   	YuangongkaoqinVO selectVO(@Param("ew") Wrapper<YuangongkaoqinEntity> wrapper);
   	
   	List<YuangongkaoqinView> selectListView(Wrapper<YuangongkaoqinEntity> wrapper);
   	
   	YuangongkaoqinView selectView(@Param("ew") Wrapper<YuangongkaoqinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuangongkaoqinEntity> wrapper);
   	
}

