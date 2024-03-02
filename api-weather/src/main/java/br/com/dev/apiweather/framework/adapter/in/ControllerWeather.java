package br.com.dev.apiweather.framework.adapter.in;

import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dev.apiweather.application.port.in.WeatherUseCase;
import br.com.dev.apiweather.domain.dto.internal.WeatherForecastDTO;

@RestController
@RequestMapping("/weather")
public class ControllerWeather {
	
	@Autowired
	private WeatherUseCase weatherUseCase;
	
	@GetMapping("/{id}")
	public ResponseEntity<WeatherForecastDTO> getWeatherByZipCodeOrCity(@PathVariable String id) throws URISyntaxException {
		var weatherCity = weatherUseCase.getWeather(id);
		return ResponseEntity.ok().body(weatherCity);
	}

}
