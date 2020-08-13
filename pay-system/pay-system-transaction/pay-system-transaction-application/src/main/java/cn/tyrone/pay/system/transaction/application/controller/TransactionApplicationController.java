package cn.tyrone.pay.system.transaction.application.controller;

import cn.tyrone.pay.common.beans.ResponseMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction")
public class TransactionApplicationController {

//    @Reference private IPayTransactionService payTransactionService;

    @GetMapping("/test")
    public ResponseMessage test(){
        ResponseMessage responseMessage = ResponseMessage.resultSuccess();
        return responseMessage;
    }

}
