package cn.tyrone.payment.core.application.service.gateway;

import cn.tyrone.payment.core.application.service.route.PaymentAccountRoute;
import cn.tyrone.payment.core.domain.adapter.entity.Response.OpenAccountResponse;
import cn.tyrone.payment.core.domain.adapter.entity.request.OpenAccountRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentServiceGateway {

    @Autowired private PaymentAccountRoute paymentAccountRoute;

    public OpenAccountResponse openAccount(OpenAccountRequest request){
        OpenAccountResponse openAccountResponse = paymentAccountRoute.openAccount(request);
        return openAccountResponse;
    }

}
