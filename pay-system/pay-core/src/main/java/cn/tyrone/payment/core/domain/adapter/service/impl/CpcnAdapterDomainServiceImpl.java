package cn.tyrone.payment.core.domain.adapter.service.impl;

import cn.tyrone.payment.core.domain.adapter.converter.CpcnMessageConverter;
import cn.tyrone.payment.core.domain.adapter.entity.Response.OpenAccountResponse;
import cn.tyrone.payment.core.domain.adapter.entity.request.OpenAccountRequest;
import cn.tyrone.payment.core.domain.adapter.service.ICpcnAdapterDomainService;
import cn.tyrone.payment.core.infrastructure.api.CpcnPaymentService;
import com.trz.netwk.api.trd.TrdT1001Request;
import com.trz.netwk.api.trd.TrdT1001Response;
import org.springframework.beans.factory.annotation.Autowired;

public class CpcnAdapterDomainServiceImpl implements ICpcnAdapterDomainService {

    @Autowired private CpcnMessageConverter messageConverter;
    @Autowired private CpcnPaymentService cpcnPaymentService;

    @Override
    public OpenAccountResponse openAccount(OpenAccountRequest request) {

        TrdT1001Request trdT1001Request = messageConverter.packageTrdT1001Request(request);
        TrdT1001Response trdT1001Response = cpcnPaymentService.t1001(trdT1001Request);
        OpenAccountResponse response = messageConverter.packageOpenAccountResponse(trdT1001Response);

        return response;
    }
}
