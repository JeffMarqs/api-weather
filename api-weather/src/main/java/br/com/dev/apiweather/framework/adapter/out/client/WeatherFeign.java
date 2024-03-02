package br.com.dev.apiweather.framework.adapter.out.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.dev.apiweather.domain.dto.feing.openweathermap.WeatherDataDTO;

@FeignClient(name = "Weather", url = "https://api.openweathermap.org")
public interface WeatherFeign {
	
	@GetMapping("/data/2.5/weather")
	WeatherDataDTO getWeatherData(@RequestParam String q, @RequestParam String units, @RequestParam String appid);

}
