package br.com.dev.apiweather.framework.adapter.out.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.dev.apiweather.domain.entities.WeatherData;

@FeignClient(name = "Weather", url = "https://api.openweathermap.org")
public interface WeatherFeign {
	
	@GetMapping("/data/2.5/weather")
	WeatherData getWeatherData(@RequestParam String q, @RequestParam String units, @RequestParam String appid);

}
