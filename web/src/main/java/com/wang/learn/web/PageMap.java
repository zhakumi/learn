package com.wang.learn.web;

import java.util.Map;

/**
 * Created with IDEA
 * author:wangcan
 * Date:5/16/2018
 * Time:8:32 PM
 */
public class PageMap<K, V> {
        private int pageSize;
        private int page;
        private long total;
        private Map<K, V> map;

        public PageMap(int pageSize, int page, long total, Map<K, V> map) {
            this.pageSize = pageSize;
            this.page = page;
            this.total = total;
            this.map = map;
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

        public Map<K, V> getMap() {
            return this.map;
        }

        public void setMap(Map<K, V> map) {
            this.map = map;
        }
}

