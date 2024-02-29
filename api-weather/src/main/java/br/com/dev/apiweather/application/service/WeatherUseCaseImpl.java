package br.com.dev.apiweather.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dev.apiweather.application.port.in.WeatherUseCase;
import br.com.dev.apiweather.application.port.out.GetWeatherCityPortOut;
import br.com.dev.apiweather.domain.dto.WeatherDto;

@Service
public class WeatherUseCaseImpl implements WeatherUseCase {

	@Autowired
	private GetWeatherCityPortOut getWeatherCityPortOut;

	@Override
	public WeatherDto getWeatherCity(String city) {

		var weatherData = getWeatherCityPortOut.getWeatherCity(city);

		var weatherDto = new WeatherDto(weatherData.getName(), weatherData.getSys().getCountry(),
				weatherData.getMain().getTempMax().toString(), weatherData.getMain().getTempMin().toString());

		return weatherDto;
	}

}
