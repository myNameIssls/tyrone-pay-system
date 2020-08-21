package cn.tyrone.payment.core.application.service.route;

import cn.tyrone.payment.core.domain.adapter.entity.Response.OpenAccountResponse;
import cn.tyrone.payment.core.domain.adapter.entity.request.OpenAccountRequest;
import cn.tyrone.payment.core.domain.adapter.service.ICpcnAdapterDomainService;
import cn.tyrone.payment.core.domain.route.entity.enums.PaymentChannelEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentAccountRoute {

    @Autowired private ICpcnAdapterDomainService cpcnAdapterDomainService;

    public Object openAccount(OpenAccountRequest request){

        PaymentChannelEnum paymentChannelEnum = request.getPaymentChannelEnum();

        if (paymentChannelEnum.equals(PaymentChannelEnum.CPCN)) {
            OpenAccountResponse openAccountResponse = cpcnAdapterDomainService.openAccount(request);
        }

        return null;
    }

}
