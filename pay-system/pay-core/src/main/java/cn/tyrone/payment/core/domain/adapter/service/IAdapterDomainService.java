package cn.tyrone.payment.core.domain.adapter.service;

import cn.tyrone.payment.core.domain.adapter.entity.Response.OpenAccountResponse;
import cn.tyrone.payment.core.domain.adapter.entity.request.OpenAccountRequest;

public interface IAdapterDomainService {

    public OpenAccountResponse openAccount(OpenAccountRequest request);

}
