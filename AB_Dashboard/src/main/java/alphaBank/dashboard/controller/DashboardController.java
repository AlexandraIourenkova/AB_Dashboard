package alphaBank.dashboard.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alphaBank")
public class DashboardController {
	
	@GetMapping("/getBalance")
	public int getBalance(@RequestHeader("Authorization")String login) {
		return 0;
	}

}
