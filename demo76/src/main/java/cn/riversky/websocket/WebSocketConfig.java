package cn.riversky.websocket;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

/**
 * 广播式
 * 即服务端有消息时，会将消息发送给所有连接了当前endpoint的浏览器
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/23.
 */
@Configuration
@EnableWebSocketMessageBroker//开启使用STOMP协议来传输基于代理的messagebroker
public class WebSocketConfig  extends AbstractWebSocketMessageBrokerConfigurer{
    /**
     * 注册STOMp协议节点(endpoint)并映射指定的的URL
     * @param registry
     */
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/endpoint").withSockJS();
    }

    /**
     * 配置消息代理
     * 广播式应该配置一个topic消息代理
     * @param registry
     */
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {

        registry.enableSimpleBroker("/topic");
    }

}
