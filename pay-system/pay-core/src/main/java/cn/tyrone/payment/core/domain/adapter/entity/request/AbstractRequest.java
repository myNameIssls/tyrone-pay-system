package cn.tyrone.payment.core.domain.adapter.entity.request;

import cn.tyrone.payment.core.domain.route.entity.enums.PaymentChannelEnum;
import lombok.Data;

import java.io.Serializable;

@Data
public class AbstractRequest implements Serializable {

    private PaymentChannelEnum paymentChannelEnum;

}
