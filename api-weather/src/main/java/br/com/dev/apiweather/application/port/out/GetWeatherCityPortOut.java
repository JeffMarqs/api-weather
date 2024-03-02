package br.com.dev.apiweather.application.port.out;

import br.com.dev.apiweather.domain.dto.feing.openweathermap.WeatherDataDTO;

public interface GetWeatherCityPortOut {

	WeatherDataDTO getWeatherCity(String city);

}
