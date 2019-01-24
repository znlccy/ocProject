package com.online.college.common.orm;

import java.io.Serializable;

/**
 * author: TRS信息技术有限公司
 * date: 2019/1/24-14:26
 * version: 1.0.0
 * comment: 身份认证
 */
public interface Identifier<KEY extends Serializable> {

    /**
     * 获取主键
     * @return
     */
    public KEY getId();
}
