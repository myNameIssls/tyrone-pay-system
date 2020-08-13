package cn.tyrone.pay.core.domain.service;

import cn.tyrone.pay.core.domain.entity.Response.OpenAccountResponse;
import cn.tyrone.pay.core.domain.entity.request.OpenAccountRequest;

public interface IPaymentChannelService {

    public OpenAccountResponse openAccount(OpenAccountRequest request);

}
