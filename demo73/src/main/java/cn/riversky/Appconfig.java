package cn.riversky;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 1接管Spring boot的web配置
 * 2注册自己的Servlet，Filter,Listener
 * 当使用嵌入式的Servlet容器时，我们通过将Servlet,Filter和Listener声明为Spring Bean而达到注册的效果
 * 或者注册ServletRegistrationBean,FilterRegistrationBean,ServletListenerRegistrationBean
 * @author riversky E-mail:riversky@126.com
 * @version 创建时间 ： 2017/12/23.
 */
@Configuration
public class Appconfig  extends WebMvcConfigurerAdapter{
    /**
     * 这里并不会覆盖WebMvcAutoConfiguration中的addViewControllers
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index").setViewName("index");
    }
}
