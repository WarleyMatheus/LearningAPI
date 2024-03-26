package wm.software.apilearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import wm.software.service.ApiService;

@SpringBootApplication
@RestController
public class ApilearningApplication {
	
	ApiService apiService = new ApiService();
	
	@GetMapping("/hello")
    public String test(){
		String data = apiService.getApiData();
        return data;
    }

	public static void main(String[] args) {
		SpringApplication.run(ApilearningApplication.class, args);
	}

}
