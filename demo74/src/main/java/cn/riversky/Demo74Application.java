package cn.riversky;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ssl证书
 * 生成
 * keytool -genkey -alias tomcat
 * 保存
 * keytool -export -alias tomcat -file keystore
 * 代码配置
 */
@RestController
@SpringBootApplication
public class Demo74Application {

	@RequestMapping("/")
	public String index(){
		return "hello";
	}
	public static void main(String[] args) {
		SpringApplication.run(Demo74Application.class, args);
	}

	/**
	 * 通用配置
	 */
//	@Component
//	public static class CustomservletContainer implements EmbeddedServletContainerCustomizer{
//		@Override
//		public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {
//			configurableEmbeddedServletContainer.setPort(8888);
//			configurableEmbeddedServletContainer.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND,"/404.html"));
//			configurableEmbeddedServletContainer.setSessionTimeout(10, TimeUnit.MINUTES);
//		}
//	}
//
//	/**
//	 * 特定配置
//	 * @return
//	 */
//	@Bean
//	public EmbeddedServletContainerFactory servletContainerFactory(){
//		JettyEmbeddedServletContainerFactory factory=new JettyEmbeddedServletContainerFactory();
//		factory.setPort(8888);
//		factory.setSessionTimeout(10,TimeUnit.MINUTES);
//		return factory;
//	}
}
