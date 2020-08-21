package cn.tyrone.payment.core.domain.route.entity.enums;

/**
 * 支付渠道枚举
 */
public enum PaymentChannelEnum {

    CPCN("CPCN", "中金支付")
    ;

    /**
     * 渠道编码
     */
    private String code;

    /**
     * 渠道名称
     */
    private String name;

    private PaymentChannelEnum(String code, String name){
        this.code = code;
        this.name = name;
    }

}
