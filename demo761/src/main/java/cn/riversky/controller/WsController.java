package cn.riversky.controller;

import cn.riversky.po.DemoMessage;
import cn.riversky.po.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.security.Principal;

/**
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/23.
 */
@Controller
public class WsController {
    /**
     * 通过该模版向浏览器发送消息
     */
    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    /**
     * 可以直接在参数principal中获取当前用户的信息
     * @param principal
     * @param msg
     */
    @MessageMapping("/chat")
    public void handleChat(Principal principal,String msg){
        if(principal.getName().equals("wyf")){
            messagingTemplate.convertAndSendToUser("wisely","/queue/notifications",principal.getName()+" -send:"+msg);
        }else {
            messagingTemplate.convertAndSendToUser("wyf","queue/notifications",principal.getName()+"-send:"+msg);
        }
    }
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
