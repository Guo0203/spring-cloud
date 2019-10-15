package com.gpf.api.service.impl;

import com.gpf.api.dao.OperationLogDao;
import com.gpf.api.service.OperationLogService;
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
public class OperationLogServiceImpl implements OperationLogService {

    @Autowired(required = false)
    private OperationLogDao operationLogDao;

    @Override
    public void insert(OperationLog operationLog) {
        operationLogDao.insertOperation(operationLog);
    }
}
