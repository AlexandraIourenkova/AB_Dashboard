package alphaBank.dashboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import alphaBank.dashboard.service.IDashBoard;

@RestController
@RequestMapping("/alphaBank")
public class DashboardController {
	IDashBoard service;
	
	@Autowired
	public DashboardController(IDashBoard service) {
		this.service = service;
	}

	@GetMapping("/getBalance/id/{id}")
	public int getBalance(@PathVariable String id) {
		return service.getBalance(id);
	}

}
