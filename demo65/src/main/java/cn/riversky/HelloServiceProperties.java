package cn.riversky;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 类型安全获取，这里配置中，hello.msg进行设置，如果不设置就是hello.msg=word
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/23.
 */
@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperties {
    private static final String MSG="world";
    private String msg=MSG;


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
