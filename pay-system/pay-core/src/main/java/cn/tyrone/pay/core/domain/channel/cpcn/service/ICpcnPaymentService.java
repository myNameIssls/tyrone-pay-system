package cn.tyrone.pay.core.domain.channel.cpcn.service;

import com.trz.netwk.api.trd.TrdT1001Request;
import com.trz.netwk.api.trd.TrdT1001Response;

/**
 * 中金支付接口
 */
public interface ICpcnPaymentService {

    public TrdT1001Response t1001(TrdT1001Request trdT1001Request);

}
