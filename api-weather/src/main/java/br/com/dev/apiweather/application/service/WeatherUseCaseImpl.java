package br.com.dev.apiweather.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dev.apiweather.application.exception.CityNotFoundException;
import br.com.dev.apiweather.application.helper.Mapper;
import br.com.dev.apiweather.application.port.in.WeatherUseCase;
import br.com.dev.apiweather.application.port.out.GetWeatherCityPortOut;
import br.com.dev.apiweather.domain.dto.WeatherDto;
import feign.FeignException;

@Service
public class WeatherUseCaseImpl implements WeatherUseCase {

	@Autowired
	private GetWeatherCityPortOut getWeatherCityPortOut;

	@Override
	public WeatherDto getWeatherCity(String city) {
		
		try {
			
			var weatherData = getWeatherCityPortOut.getWeatherCity(city);
			
			var weatherDto = new WeatherDto();
			
			return Mapper.mapperWeatherDatatoWeatherDto(weatherData, weatherDto);
			
		} catch (FeignException e) {
			
			throw new CityNotFoundException("The city of '" + city + "' was not found");
		}



	}

}
