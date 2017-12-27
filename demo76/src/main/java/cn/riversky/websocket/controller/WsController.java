package cn.riversky.websocket.controller;

import cn.riversky.websocket.po.DemoMessage;
import cn.riversky.websocket.po.ResponseMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/23.
 */
@Controller
public class WsController {
    /**
     * welcome 映射地址
     * sendto 当服务端有消息时，会对订阅了@SendTo中的路径的浏览器发送消息
     * @param demoMessage
     * @return
     * @throws InterruptedException
     */
    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public ResponseMessage say(DemoMessage demoMessage) throws InterruptedException {
        Thread.sleep(3000);
        return new ResponseMessage("welcome,"+demoMessage.getName()+"!");
    }
}
