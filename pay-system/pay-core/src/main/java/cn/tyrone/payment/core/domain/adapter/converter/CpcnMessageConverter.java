package cn.tyrone.payment.core.domain.adapter.converter;

import cn.tyrone.payment.core.domain.adapter.entity.Response.OpenAccountResponse;
import cn.tyrone.payment.core.domain.adapter.entity.request.OpenAccountRequest;
import com.trz.netwk.api.trd.TrdT1001Request;
import com.trz.netwk.api.trd.TrdT1001Response;
import org.springframework.stereotype.Component;

/**
 * 中金支付报文适配器
 */
@Component
public class CpcnMessageConverter {
    public TrdT1001Request packageTrdT1001Request(OpenAccountRequest request) {
        TrdT1001Request trdT1001Request = new TrdT1001Request();
        return trdT1001Request;
    }

    public OpenAccountResponse packageOpenAccountResponse(TrdT1001Response trdT1001Response) {
        OpenAccountResponse response = new OpenAccountResponse();

        return response;
    }
}
