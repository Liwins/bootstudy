package cn.riversky;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * http://patorjk.com/software/taag
 * banner生成网站
 * //@SpringBootApplication//开启自动配置
 *@author riversky
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})//关闭特定的自动配置
@RestController
public class BootstudyApplication {
	/**
	 * 将配置文件中的值用EL进行表示
	 */
	@Value("${book.author}")
	private String bookAuthor;
	@Value("${book.name}")
	private String bookName;

	@RequestMapping("/")
	public String index(){
		return "hello spring boot,author:"+bookAuthor+"		name:"+bookName;
	}

	/**
	 * 关闭banner
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication app=new SpringApplication(BootstudyApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}
}
