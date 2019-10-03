package com.gpf.common.service;

import com.gpf.common.entities.OperationLog;
import com.gpf.common.service.impl.OperationLogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description: 日志操作业务层
 * @package: com.gpf.common.service
 * @Auther: Pengfei.Guo
 * @Date: Created in 2019/10/3 13:08
 */
@Service
public class OperationLogService {

    @Autowired(required = false)
    private OperationLogServiceImpl operationLogServiceImpl;

    public void insert(OperationLog operationLog){
        System.out.println(operationLog);
        operationLogServiceImpl.insertLog(operationLog);
    }

}
