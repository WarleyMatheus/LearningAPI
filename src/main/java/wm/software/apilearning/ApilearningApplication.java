package wm.software.apilearning;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import wm.software.service.ApiService;

@SpringBootApplication
@RestController
public class ApilearningApplication {
	
	ApiService apiService = new ApiService();
	@Value("${spring.application.name}")
	private String appName;
	
	@GetMapping("/inicio")
	public String appPropertiesTest(){
		return appName;
	}

	public static void main(String[] args) {
		SpringApplication.run(ApilearningApplication.class, args);
	}

}
