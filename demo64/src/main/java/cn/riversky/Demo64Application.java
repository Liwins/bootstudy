package cn.riversky;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo64Application {
	@Autowired
	HelloService helloService;


	@RequestMapping("/")
	public String index(){
		return helloService.sayHello();
	}
	public static void main(String[] args) {
		SpringApplication.run(Demo64Application.class, args);
	}
}
