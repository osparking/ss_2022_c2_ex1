package space.bum.controllers;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@GetMapping("/demo")
	String demo() {
		var auth = SecurityContextHolder.getContext().getAuthentication();
		return "demo";
	}

}
