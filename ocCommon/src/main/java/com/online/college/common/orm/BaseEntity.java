package com.online.college.common.orm;

import lombok.Data;

import java.util.Date;

/**
 * author: TRS信息技术有限公司
 * date: 2019/1/24-14:25
 * version: 1.0.0
 * comment: 基础实体类
 */
@Data
public class BaseEntity extends LongModel {

    /**
     * 序列号
     */
    private static final long serialVersionUID = 2227850114499003693L;

    /**
     * 创建用户
     */
    private String createUser;

    /**
     * 更新用户
     */
    private String updateUser;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}
