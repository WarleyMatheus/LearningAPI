package wm.software.controller;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import wm.software.service.ApiService;

@RestController
@Profile("development")
public class GetController {
	
	private final ApiService apiService;
	
	public GetController(ApiService apiService) {
		this.apiService = apiService;
	}
	
	@GetMapping("/data")
    public String test(){
		String data = apiService.getApiData();
        return data;
    }
	
}
