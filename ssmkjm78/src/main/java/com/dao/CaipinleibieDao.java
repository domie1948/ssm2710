package com.dao;

import com.entity.CaipinleibieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CaipinleibieVO;
import com.entity.view.CaipinleibieView;


/**
 * 菜品类别
 * 
 * @author 
 * @email 
 * @date 2021-04-18 01:00:26
 */
public interface CaipinleibieDao extends BaseMapper<CaipinleibieEntity> {
	
	List<CaipinleibieVO> selectListVO(@Param("ew") Wrapper<CaipinleibieEntity> wrapper);
	
	CaipinleibieVO selectVO(@Param("ew") Wrapper<CaipinleibieEntity> wrapper);
	
	List<CaipinleibieView> selectListView(@Param("ew") Wrapper<CaipinleibieEntity> wrapper);

	List<CaipinleibieView> selectListView(Pagination page,@Param("ew") Wrapper<CaipinleibieEntity> wrapper);
	
	CaipinleibieView selectView(@Param("ew") Wrapper<CaipinleibieEntity> wrapper);
	
}
