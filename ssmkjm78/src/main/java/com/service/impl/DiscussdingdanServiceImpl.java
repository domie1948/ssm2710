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


import com.dao.DiscussdingdanDao;
import com.entity.DiscussdingdanEntity;
import com.service.DiscussdingdanService;
import com.entity.vo.DiscussdingdanVO;
import com.entity.view.DiscussdingdanView;

@Service("discussdingdanService")
public class DiscussdingdanServiceImpl extends ServiceImpl<DiscussdingdanDao, DiscussdingdanEntity> implements DiscussdingdanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussdingdanEntity> page = this.selectPage(
                new Query<DiscussdingdanEntity>(params).getPage(),
                new EntityWrapper<DiscussdingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussdingdanEntity> wrapper) {
		  Page<DiscussdingdanView> page =new Query<DiscussdingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussdingdanVO> selectListVO(Wrapper<DiscussdingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussdingdanVO selectVO(Wrapper<DiscussdingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussdingdanView> selectListView(Wrapper<DiscussdingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussdingdanView selectView(Wrapper<DiscussdingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
