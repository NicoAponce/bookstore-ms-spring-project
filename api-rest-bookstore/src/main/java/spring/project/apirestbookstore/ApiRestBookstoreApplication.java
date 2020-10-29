package spring.project.apirestbookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ApiRestBookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestBookstoreApplication.class, args);
	}

}
