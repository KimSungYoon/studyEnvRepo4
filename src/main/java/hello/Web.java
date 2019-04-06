package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Web {

	@RequestMapping
	public String home() {
		return "hello studyEnv4!!  This is Revolution  WOW!!!!!  I'm tired!! ";
	}
	
}
 