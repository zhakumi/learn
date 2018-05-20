package com.wang.learn.consumer.web;

import java.util.List;

/**
 * Created with IDEA
 * author:wangcan
 * Date:5/16/2018
 * Time:8:31 PM
 */
public class PageList<E> {
    private int pageSize;
    private int page;
    private long total;
    private List<E> data;

    public PageList(int pageSize, int page, long total, List<E> data) {
        this.pageSize = pageSize;
        this.page = page;
        this.total = total;
        this.data = data;
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

    public List<E> getData() {
        return this.data;
    }

    public void setData(List<E> data) {
        this.data = data;
    }
}
