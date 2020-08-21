package cn.tyrone.payment.core.domain.adapter.entity;

import lombok.Data;
import lombok.ToString;

/**
 * 支付报文对象
 */
@Data @ToString
public class MessageObject {

    /**
     * 请求报文
     */
    private String requestMessage;

    /**
     * 应答报文
     */
    private String responseMessage;

    /**
     * 请求报文加密
     */
    private String encodeRequestMessage;

    /**
     * 请求报文解密
     */
    private String decodeRequestMessage;

    /**
     * 应答报文加密
     */
    private String encodeResponseMessage;

    /**
     * 应答报文解密
     */
    private String decodeResponseMessage;

    /**
     * 请求报文签名
     */
    private String signatureRequestMessage;

    /**
     * 应答报文签名
     */
    private String signatureResponseMessage;

}
