package cn.riversky;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class Demo75Application {

	@RequestMapping("/")
	public String inde(){
		return "index";
	}
	public static void main(String[] args) {
		SpringApplication.run(Demo75Application.class, args);
	}
}
