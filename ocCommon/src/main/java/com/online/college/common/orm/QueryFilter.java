package com.online.college.common.orm;

/**
 * author: TRS信息技术有限公司
 * date: 2019/1/24-14:42
 * version: 1.0.0
 * comment: 查询过滤
 */
public class QueryFilter {

    /**
     * 计数器
     */
    Integer timeCount = 0;

    /**
     * 条件语句(最多3个)
     */
    private StringBuilder where = new StringBuilder();

    /**
     * 排序语句
     */
    private StringBuilder sort = new StringBuilder();

    /**
     * 获取查询语句
     * @return
     */
    public String getWhere() {
        return where.toString();
    }

    /**
     * 获取排序语句
     * @return
     */
    public String getSort() {
        return sort.toString();
    }
}
