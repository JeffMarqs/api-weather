package br.com.dev.apiweather.application.port.in;

import br.com.dev.apiweather.domain.dto.WeatherDto;

public interface WeatherUseCase {

	WeatherDto getWeatherCity(String city);

}
