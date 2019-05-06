package co.uk.mak.tripmate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class TripmateApplication {

	public static void main(String[] args) {
		SpringApplication.run(TripmateApplication.class, args);
	}

}
