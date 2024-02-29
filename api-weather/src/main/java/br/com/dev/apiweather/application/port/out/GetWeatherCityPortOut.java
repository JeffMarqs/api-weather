package br.com.dev.apiweather.application.port.out;

import br.com.dev.apiweather.domain.entities.WeatherData;

public interface GetWeatherCityPortOut {

	WeatherData getWeatherCity(String city);

}
