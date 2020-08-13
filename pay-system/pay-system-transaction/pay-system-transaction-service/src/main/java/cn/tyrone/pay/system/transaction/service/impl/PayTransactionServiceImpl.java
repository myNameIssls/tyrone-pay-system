package cn.tyrone.pay.system.transaction.service.impl;

import cn.tyrone.pay.common.beans.ResponseMessage;
import cn.tyrone.pay.transaction.service.IPayTransactionService;

//@org.apache.dubbo.config.annotation.Service
public class PayTransactionServiceImpl implements IPayTransactionService {

    @Override
    public ResponseMessage test() {
        ResponseMessage responseMessage = ResponseMessage.resultSuccess();

        return responseMessage;
    }
}
