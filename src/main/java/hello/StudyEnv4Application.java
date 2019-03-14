package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudyEnv4Application {

	public static void main(String[] args) {
		System.out.println("MyHello   contents change!!");
		SpringApplication.run(StudyEnv4Application.class, args);
	}

}
