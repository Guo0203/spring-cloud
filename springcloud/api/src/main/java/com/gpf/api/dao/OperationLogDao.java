package com.gpf.api.dao;

import com.gpf.common.entities.OperationLog;

/**
 * @Description: dao层
 * @package: com.gpf.common.dao
 * @Auther: Pengfei.Guo
 * @Date: Created in 2019/10/3 13:07
 */
public interface OperationLogDao {

    void insertOperation(OperationLog operationLog);

}
