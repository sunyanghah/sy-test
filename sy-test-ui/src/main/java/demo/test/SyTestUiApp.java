package demo.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication(scanBasePackages={"demo.test"})
@EnableFeignClients
@EnableEurekaClient
@EnableCircuitBreaker
@EnableHystrix
public class SyTestUiApp {

	public static void main(String[] args) {
		SpringApplication.run(SyTestUiApp.class, args);
	}
}
