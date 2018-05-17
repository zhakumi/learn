package com.wang.learn.web;

import org.apache.ibatis.session.*;
import org.mybatis.spring.SqlSessionTemplate;

import java.sql.Connection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created with IDEA
 * author:wangcan
 * Date:5/16/2018
 * Time:8:30 PM
 */
public class SqlSessionDecorator {
    private SqlSessionTemplate sqlSessionTemplate;

    public SqlSessionDecorator(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public SqlSessionTemplate getSqlSessionTemplate() {
        return this.sqlSessionTemplate;
    }

    public SqlSession openSession() {
        return this.sqlSessionTemplate.getSqlSessionFactory().openSession();
    }

    public SqlSession openBatchSession() {
        return this.sqlSessionTemplate.getSqlSessionFactory().openSession(ExecutorType.BATCH, false);
    }

    public <T> T selectOne(String statement) {
        return this.sqlSessionTemplate.selectOne(statement);
    }

    public <T> T selectOne(String statement, Object parameter) {
        return this.sqlSessionTemplate.selectOne(statement, parameter);
    }

    public <E> List<E> selectList(String statement) {
        return this.sqlSessionTemplate.selectList(statement);
    }

    public <E> List<E> selectList(String statement, Object parameter) {
        return this.sqlSessionTemplate.selectList(statement, parameter);
    }

    public <E> PageList<E> selectList(String statement, Object parameter, int pageNo, int pageSize) {
        PageResult<E> page = (PageResult)this.sqlSessionTemplate.selectList(statement, parameter, new RowBounds(pageNo, pageSize));
        return new PageList(page.getPageSize(), page.getPage(), page.getTotal(), page);
    }

    public <K, V> Map<K, V> selectMap(String statement, String mapKey) {
        return this.sqlSessionTemplate.selectMap(statement, mapKey);
    }

    public <K, V> Map<K, V> selectMap(String statement, Object parameter, String mapKey) {
        return this.sqlSessionTemplate.selectMap(statement, parameter, mapKey);
    }

    public <K, V> PageMap<K, V> selectMap(String statement, Object parameter, String mapKey, RowBounds rowBounds) {
        return (PageMap)this.sqlSessionTemplate.selectMap(statement, parameter, mapKey, rowBounds);
    }

    public void select(String statement, Object parameter, ResultHandler resultHandler) {
        this.sqlSessionTemplate.select(statement, parameter, resultHandler);
    }

    public void select(String statement, ResultHandler resultHandler) {
        this.sqlSessionTemplate.select(statement, resultHandler);
    }

    public void select(String statement, Object parameter, RowBounds rowBounds, ResultHandler resultHandler) {
        this.sqlSessionTemplate.select(statement, parameter, rowBounds, resultHandler);
    }

    public int insert(String statement) {
        return this.sqlSessionTemplate.insert(statement);
    }

    public int insert(String statement, Object parameter) {
        return this.sqlSessionTemplate.insert(statement, parameter);
    }

    public int insertBatch(String statement, Collection<?> list) {
        int count = 0;
        SqlSession sqlSession = this.openBatchSession();
        Throwable var5 = null;

        try {
            Object parameter;
            for(Iterator var6 = list.iterator(); var6.hasNext(); count += sqlSession.insert(statement, parameter)) {
                parameter = var6.next();
            }

            sqlSession.commit();
            return count;
        } catch (Throwable var15) {
            var5 = var15;
            throw var15;
        } finally {
            if (sqlSession != null) {
                if (var5 != null) {
                    try {
                        sqlSession.close();
                    } catch (Throwable var14) {
                        var5.addSuppressed(var14);
                    }
                } else {
                    sqlSession.close();
                }
            }

        }
    }

    public int update(String statement) {
        return this.sqlSessionTemplate.update(statement);
    }

    public int update(String statement, Object parameter) {
        return this.sqlSessionTemplate.update(statement, parameter);
    }

    public int updateBatch(String statement, Collection<?> list) {
        int count = 0;
        SqlSession sqlSession = this.openBatchSession();
        Throwable var5 = null;

        try {
            Object parameter;
            for(Iterator var6 = list.iterator(); var6.hasNext(); count += sqlSession.update(statement, parameter)) {
                parameter = var6.next();
            }

            sqlSession.commit();
            return count;
        } catch (Throwable var15) {
            var5 = var15;
            throw var15;
        } finally {
            if (sqlSession != null) {
                if (var5 != null) {
                    try {
                        sqlSession.close();
                    } catch (Throwable var14) {
                        var5.addSuppressed(var14);
                    }
                } else {
                    sqlSession.close();
                }
            }

        }
    }

    public int delete(String statement) {
        return this.sqlSessionTemplate.delete(statement);
    }

    public int delete(String statement, Object parameter) {
        return this.sqlSessionTemplate.delete(statement, parameter);
    }

    public int deleteBatch(String statement, Collection<?> list) {
        int count = 0;
        SqlSession sqlSession = this.openBatchSession();
        Throwable var5 = null;

        try {
            Object parameter;
            for(Iterator var6 = list.iterator(); var6.hasNext(); count += sqlSession.delete(statement, parameter)) {
                parameter = var6.next();
            }

            sqlSession.commit();
            return count;
        } catch (Throwable var15) {
            var5 = var15;
            throw var15;
        } finally {
            if (sqlSession != null) {
                if (var5 != null) {
                    try {
                        sqlSession.close();
                    } catch (Throwable var14) {
                        var5.addSuppressed(var14);
                    }
                } else {
                    sqlSession.close();
                }
            }

        }
    }

    public void clearCache() {
        this.sqlSessionTemplate.clearCache();
    }

    public Configuration getConfiguration() {
        return this.sqlSessionTemplate.getConfiguration();
    }

    public <T> T getMapper(Class<T> aClass) {
        return this.sqlSessionTemplate.getMapper(aClass);
    }

    public Connection getConnection() {
        return this.sqlSessionTemplate.getConnection();
    }
}
