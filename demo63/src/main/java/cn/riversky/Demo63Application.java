package cn.riversky;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author  ri
 */
@SpringBootApplication
@RestController
public class Demo63Application {
	@Autowired
private AuthorSetting authorSettings;
	@RequestMapping("/")
	public String index(){
		return "author name is "+authorSettings.getName()+" and author age="+authorSettings.getAge();
	}
	public static void main(String[] args) {
		SpringApplication.run(Demo63Application.class, args);
	}
}
