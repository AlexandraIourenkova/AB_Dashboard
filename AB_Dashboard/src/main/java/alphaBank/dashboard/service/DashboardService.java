package alphaBank.dashboard.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DashboardService implements IDashBoard {
	private static final String REPO_SERVICE_URL = "/alphaBank/balance/id";
	RestTemplate restTemplate = new RestTemplate();
	@Value("${app.data.provider.service.host:http://localhost:8887}")
	String dataProviderServiceHostRepo;
	
	@Override
	public int getBalance(String id) {
		RestTemplate restTemplate = new RestTemplate();
		Integer balance = restTemplate.exchange(dataProviderServiceHostRepo + REPO_SERVICE_URL + "/"+id+"/", HttpMethod.GET, null, Integer.class).getBody();
		return balance;
	}

}
