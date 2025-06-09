package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CaipinleibieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CaipinleibieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CaipinleibieView;


/**
 * 菜品类别
 *
 * @author 
 * @email 
 * @date 2021-04-18 01:00:26
 */
public interface CaipinleibieService extends IService<CaipinleibieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CaipinleibieVO> selectListVO(Wrapper<CaipinleibieEntity> wrapper);
   	
   	CaipinleibieVO selectVO(@Param("ew") Wrapper<CaipinleibieEntity> wrapper);
   	
   	List<CaipinleibieView> selectListView(Wrapper<CaipinleibieEntity> wrapper);
   	
   	CaipinleibieView selectView(@Param("ew") Wrapper<CaipinleibieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CaipinleibieEntity> wrapper);
   	
}

