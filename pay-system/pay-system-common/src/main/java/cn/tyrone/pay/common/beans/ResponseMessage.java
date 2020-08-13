package cn.tyrone.pay.common.beans;

import java.io.Serializable;

/**
 * 响应结果
 */
public class ResponseMessage implements Serializable {

    /**
     * 响应码,true:操作成功, false:操作失败
     */
    private Boolean code;

    /**
     * 响应消息
     */
    private String message;

    /**
     * 响应结果
     */
    private Object object;

    public ResponseMessage() {
    }

    public ResponseMessage(Boolean code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 操作成功
     * @return
     */
    public static ResponseMessage resultSuccess(){
        return new ResponseMessage(Boolean.TRUE, "操作成功");
    }

    /**
     * 操作失败
     * @return
     */
    public static ResponseMessage resultError() {
        return resultError("操作失败");
    }

    /**
     * 操作失败
     * @return
     */
    public static ResponseMessage resultError(String message) {
        return new ResponseMessage(Boolean.FALSE, message);
    }

    public String toJson(){
        return this.message;
    }

    public Boolean getCode() {
        return code;
    }

    public void setCode(Boolean code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public static void main(String[] args) {
        ResponseMessage responseMessage = ResponseMessage.resultSuccess();
        String s = responseMessage.toJson();
        System.out.println(s);
    }

}
