package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Web {

	@RequestMapping("name")
	public String hello() {
		return "This is hello Ver.22      Version Up";
	}
	
}
 