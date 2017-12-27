package cn.riversky.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.nio.charset.Charset;

/**
 * 实现web.xml中的编码过滤器
 * 因为没有了配置文件，所以需要这里。。。
 * spring.http.endoding
 * spring.http.encoding.charset=编码
 * spring.http.encoding.force=false
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/23.
 */
@ConfigurationProperties(prefix = "spring.http.encoding")
public class HttpEndodingProperties {
    public static final Charset CHARSET_DEFAULT=Charset.forName("UTF-8");
    private Charset charset=CHARSET_DEFAULT;
    private boolean force=true;


    public Charset getCharset() {
        return charset;
    }

    public void setCharset(Charset charset) {
        this.charset = charset;
    }

    public boolean isForce() {
        return force;
    }

    public void setForce(boolean force) {
        this.force = force;
    }
}
