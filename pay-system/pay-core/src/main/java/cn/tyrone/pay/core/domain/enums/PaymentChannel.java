package cn.tyrone.pay.core.domain.enums;

/**
 * 支付渠道枚举
 */
public enum PaymentChannel {

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

    private PaymentChannel(String code, String name){
        this.code = code;
        this.name = name;
    }

}
