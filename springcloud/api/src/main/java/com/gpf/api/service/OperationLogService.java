package com.gpf.api.service;

import com.gpf.common.entities.OperationLog;

/**
 * @Description: 日志操作业务层
 * @package: com.gpf.common.service
 * @Auther: Pengfei.Guo
 * @Date: Created in 2019/10/3 13:08
 */
public interface OperationLogService {

    void insert(OperationLog operationLog);

}
