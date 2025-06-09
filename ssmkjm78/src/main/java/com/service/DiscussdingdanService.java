package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussdingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussdingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussdingdanView;


/**
 * 订单评论表
 *
 * @author 
 * @email 
 * @date 2021-04-18 01:00:26
 */
public interface DiscussdingdanService extends IService<DiscussdingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussdingdanVO> selectListVO(Wrapper<DiscussdingdanEntity> wrapper);
   	
   	DiscussdingdanVO selectVO(@Param("ew") Wrapper<DiscussdingdanEntity> wrapper);
   	
   	List<DiscussdingdanView> selectListView(Wrapper<DiscussdingdanEntity> wrapper);
   	
   	DiscussdingdanView selectView(@Param("ew") Wrapper<DiscussdingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussdingdanEntity> wrapper);
   	
}

