package demo.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication(scanBasePackages={"demo.test"})
@EnableFeignClients
@EnableEurekaClient
public class SyTestUiApp {

	public static void main(String[] args) {
		SpringApplication.run(SyTestUiApp.class, args);
	}
}
