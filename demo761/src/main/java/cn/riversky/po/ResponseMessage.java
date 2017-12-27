package cn.riversky.po;

/**
 * 服务端向浏览器发送的消息
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/23.
 */
public class ResponseMessage {
    private String responseMsg;

    public ResponseMessage(String responseMsg) {
        this.responseMsg = responseMsg;

    }

    public String getResponseMsg() {
        return responseMsg;
    }
}
