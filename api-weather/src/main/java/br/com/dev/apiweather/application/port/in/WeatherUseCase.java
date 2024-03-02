package br.com.dev.apiweather.application.port.in;

import java.net.URISyntaxException;

import br.com.dev.apiweather.domain.dto.internal.WeatherForecastDTO;

public interface WeatherUseCase {

	WeatherForecastDTO getWeather(String string) throws URISyntaxException;

}
