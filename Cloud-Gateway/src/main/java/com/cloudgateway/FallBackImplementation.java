package com.cloudgateway;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class FallBackImplementation {
	
	@GetMapping("/userfallbackmethod")
	public String userServiceFallBackMethod() {
		return "User Service is taking more time"+
	           " Please try again later ";
	}
	
	@GetMapping("/departmentfallbackmethod")
	public String departmentServiceFallBackMethod() {
		return "department Service is taking more time"+
	           " Please try again later ";
	}
	
	

}
