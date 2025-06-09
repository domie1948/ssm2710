package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.CaipinleibieDao;
import com.entity.CaipinleibieEntity;
import com.service.CaipinleibieService;
import com.entity.vo.CaipinleibieVO;
import com.entity.view.CaipinleibieView;

@Service("caipinleibieService")
public class CaipinleibieServiceImpl extends ServiceImpl<CaipinleibieDao, CaipinleibieEntity> implements CaipinleibieService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CaipinleibieEntity> page = this.selectPage(
                new Query<CaipinleibieEntity>(params).getPage(),
                new EntityWrapper<CaipinleibieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CaipinleibieEntity> wrapper) {
		  Page<CaipinleibieView> page =new Query<CaipinleibieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CaipinleibieVO> selectListVO(Wrapper<CaipinleibieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CaipinleibieVO selectVO(Wrapper<CaipinleibieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CaipinleibieView> selectListView(Wrapper<CaipinleibieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CaipinleibieView selectView(Wrapper<CaipinleibieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
