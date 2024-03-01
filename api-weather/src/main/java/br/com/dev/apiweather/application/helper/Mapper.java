package br.com.dev.apiweather.application.helper;

import static java.util.Objects.nonNull;

import br.com.dev.apiweather.domain.dto.WeatherDto;
import br.com.dev.apiweather.domain.entities.WeatherData;

public class Mapper {
	
	public static WeatherDto mapperWeatherDatatoWeatherDto(WeatherData weatherData, WeatherDto dto) {
		
		dto.setCity(weatherData.getName());
		
		if(nonNull(weatherData.getSys()))
			dto.setCountry(weatherData.getSys().getCountry());
		
		if(nonNull(weatherData.getMain())) {
			if(nonNull(weatherData.getMain().getTempMax()))
				dto.setTempMax(weatherData.getMain().getTempMax().toString());
			if(nonNull(weatherData.getMain().getTempMin()))
				dto.setTempMin(weatherData.getMain().getTempMin().toString());
		}
		
		return dto;
		
	}

}
