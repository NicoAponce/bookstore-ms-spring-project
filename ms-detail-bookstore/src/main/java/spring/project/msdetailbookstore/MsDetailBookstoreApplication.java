package spring.project.msdetailbookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class MsDetailBookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsDetailBookstoreApplication.class, args);
	}

	public static int sum(int num1, int num2){
		return num1 + num2;
	}

}
