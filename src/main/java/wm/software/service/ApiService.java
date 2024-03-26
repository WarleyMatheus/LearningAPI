package wm.software.service;

import org.springframework.web.client.RestTemplate;

public class ApiService {
	
	private RestTemplate restTemplate = new RestTemplate();
	private String apiUrl = "https://api.adviceslip.com/advice";
	
	public String getApiData() {
		String result = restTemplate.getForObject(apiUrl, String.class);
		return result;
	}
	
}
