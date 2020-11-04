package spring.project.apirestbookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableEurekaClient
@SpringBootApplication
@EnableSwagger2
public class ApiRestBookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestBookstoreApplication.class, args);
	}

	public static int sum(int num1, int num2){
		return num1 + num2;
	}

}
