package com.dao;

import com.entity.DiscussdingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussdingdanVO;
import com.entity.view.DiscussdingdanView;


/**
 * 订单评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-18 01:00:26
 */
public interface DiscussdingdanDao extends BaseMapper<DiscussdingdanEntity> {
	
	List<DiscussdingdanVO> selectListVO(@Param("ew") Wrapper<DiscussdingdanEntity> wrapper);
	
	DiscussdingdanVO selectVO(@Param("ew") Wrapper<DiscussdingdanEntity> wrapper);
	
	List<DiscussdingdanView> selectListView(@Param("ew") Wrapper<DiscussdingdanEntity> wrapper);

	List<DiscussdingdanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussdingdanEntity> wrapper);
	
	DiscussdingdanView selectView(@Param("ew") Wrapper<DiscussdingdanEntity> wrapper);
	
}
