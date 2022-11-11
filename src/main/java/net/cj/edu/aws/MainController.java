package net.cj.edu.aws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	//jsp 페이지(html)를 넘길게 아니기 때문에 restController 사용
public class MainController {
	
	@GetMapping("/")
	public String home() {
		return "<h1>aws-devops</h1>";
	}
}
