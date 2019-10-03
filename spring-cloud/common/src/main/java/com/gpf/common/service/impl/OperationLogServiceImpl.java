package com.gpf.common.service.impl;

import com.gpf.common.dao.OperationLogDao;
import com.gpf.common.entities.OperationLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @package: com.gpf.common.service.impl
 * @Auther: Pengfei.Guo
 * @Date: Created in 2019/10/3 13:10
 */
@Service
public class OperationLogServiceImpl {
    @Autowired(required = false)
    private OperationLogDao operationLogDao;

    public void insertLog(OperationLog operationLog) {
        operationLogDao.insertOperation(operationLog);
    }
}
