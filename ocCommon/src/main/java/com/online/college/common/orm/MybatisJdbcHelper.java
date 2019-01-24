package com.online.college.common.orm;

/**
 * author: TRS信息技术有限公司
 * date: 2019/1/24-14:57
 * version: 1.0.0
 * comment: Mybatis帮助类
 */
public class MybatisJdbcHelper {

    /**
     * 通过ID SQL语句
     * @param entityClass
     * @param filedNames
     * @param <T>
     * @return
     */
    public static <T> String getByIdSql(Class<T> entityClass, String... filedNames) {
        String sql = MybatisJdbcHelper.querySql(entityClass, null, filedNames);
        sql += "WHERE ID = #{param2}";
        return sql;
    }

    /**
     * 查询SQL语句
     * @param entityClass
     * @param filter
     * @param filedNames
     * @param <T>
     * @return
     */
    public static <T> String querySql(Class<T> entityClass, QueryFilter filter, String... filedNames) {
        return null;
    }
}
