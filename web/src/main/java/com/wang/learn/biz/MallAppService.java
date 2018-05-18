package com.wang.learn.biz;

import com.wang.learn.domain.admin.MallApp;

import java.util.List;

/**
 * Created with IDEA
 * author:wangcan
 * Date:5/18/2018
 * Time:4:35 PM
 */
public interface MallAppService {
    int add(MallApp mallApp);

    List<MallApp> find(int pageNum, int pageSize);
}
