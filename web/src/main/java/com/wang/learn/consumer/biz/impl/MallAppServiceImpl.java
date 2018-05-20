package com.wang.learn.consumer.biz.impl;

import com.github.pagehelper.PageHelper;
import com.wang.learn.consumer.biz.MallAppService;
import com.wang.learn.consumer.dao.admin.MallAppMapper;
import com.wang.learn.consumer.domain.admin.MallApp;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IDEA
 * author:wangcan
 * Date:5/18/2018
 * Time:8:47 AM
 */
@Service
public class MallAppServiceImpl implements MallAppService {
    @Resource
    private MallAppMapper mallAppMapper;

    @Override
    public int add(MallApp mallApp) {
        return 0;
    }

    @Override
    public List<MallApp> find(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return mallAppMapper.find();
    }

}
