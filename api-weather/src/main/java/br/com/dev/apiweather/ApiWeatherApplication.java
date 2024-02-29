package br.com.dev.apiweather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApiWeatherApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiWeatherApplication.class, args);
	}

}
