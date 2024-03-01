package br.com.dev.apiweather.framework.adapter.in;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.dev.apiweather.application.port.in.WeatherUseCase;
import br.com.dev.apiweather.domain.dto.WeatherDto;

@RestController
@RequestMapping("/weather")
public class ControllerWeather {
	
	@Autowired
	private WeatherUseCase weatherUseCase;
	
	@GetMapping
	public ResponseEntity<WeatherDto> getWeatherCity(@RequestParam String city) {
		var weatherCity = weatherUseCase.getWeatherCity(city);
		return ResponseEntity.ok().body(weatherCity);
	}

}
