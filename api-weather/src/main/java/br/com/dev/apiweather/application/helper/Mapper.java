package br.com.dev.apiweather.application.helper;

import static java.util.Objects.nonNull;

import com.gtbr.domain.Cep;

import br.com.dev.apiweather.domain.dto.feing.openweathermap.WeatherDataDTO;
import br.com.dev.apiweather.domain.dto.internal.Location;
import br.com.dev.apiweather.domain.dto.internal.Weather;
import br.com.dev.apiweather.domain.dto.internal.WeatherForecastDTO;

public class Mapper {
	
	public static WeatherForecastDTO mapperWeatherDatatoWeatherDto(WeatherDataDTO weatherData, WeatherForecastDTO dto, Cep zipCode) {
		
		var location = new Location();
		var weather = new Weather();
		
		location.setCity(weatherData.getName());
		
		if(nonNull(weatherData.getSys()))
			location.setCountry(weatherData.getSys().getCountry());
		
		if(nonNull(zipCode)) {
			location.setStreet(zipCode.getLogradouro());
			location.setDistrict(zipCode.getBairro());
			location.setState(zipCode.getUf());
			}
		
		if(nonNull(weatherData.getMain())) {
			if(nonNull(weatherData.getMain().getTempMax()))
				weather.setTempMax(weatherData.getMain().getTempMax().toString());
			if(nonNull(weatherData.getMain().getTempMin()))
				weather.setTempMin(weatherData.getMain().getTempMin().toString());
			if(nonNull(weatherData.getMain().getTemp()))
				weather.setTemp(weatherData.getMain().getTemp().toString());
		}
		
		
		dto.setLocation(location);
		dto.setWeather(weather);
		
		return dto;
		
	}

}
