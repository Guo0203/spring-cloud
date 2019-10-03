package com.gpf.common.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: 日志操作实体类
 * @package: com.gpf.common.entities
 * @Auther: Pengfei.Guo
 * @Date: Created in 2019/10/3 13:01
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OperationLog {
    private int id;
    private String userName;
    private String userRole;
    private String userIp;
    private String operation;
    private String operationObject;
    private String description;
    private String operationResult;
    private String operationTime;
}
