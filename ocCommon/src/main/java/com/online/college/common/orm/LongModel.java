package com.online.college.common.orm;

import java.io.Serializable;

/**
 * author: TRS信息技术有限公司
 * date: 2019/1/24-14:25
 * version: 1.0.0
 * comment: 长整型模型
 */
public class LongModel implements Identifier<Long>, Serializable {

    /**
     * 序列号
     */
    private static final long serialVersionUID = 1331395339001422341L;

    /**
     * 声明主键
     */
    private Long id;

    /**
     * 获取主键
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }


}
