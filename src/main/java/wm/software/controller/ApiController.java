package wm.software.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import wm.software.service.ApiService;

@RestController
public class ApiController {
	
	@Autowired
    private ApiService apiService;

    public String getData() {
        return apiService.getApiData();
    }

}
