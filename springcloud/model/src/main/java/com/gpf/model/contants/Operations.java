package com.gpf.model.contants;

import lombok.Getter;

/**
 * @Description: 操作类型枚举类
 * @package: com.gpf.contants
 * @Auther: Pengfei.Guo
 * @Date: Created in 2019/9/21 11:56
 */
public enum Operations {
    SELECT("查找"),
    INSERT("新增"),
    UPDATE("修改"),
    DELETE("删除");

    @Getter private String operation;

    Operations(String operation) {
        this.operation = operation;
    }

}
