package com.wang.learn.consumer.web;

import java.util.ArrayList;

/**
 * Created with IDEA
 * author:wangcan
 * Date:5/16/2018
 * Time:8:33 PM
 */
public class PageResult<E> extends ArrayList<E> {
    private int pageSize;
    private int page;
    private long total;

    public PageResult(int pageSize, int page) {
        this.pageSize = pageSize;
        this.page = page;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPage() {
        return this.page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public long getTotal() {
        return this.total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}

