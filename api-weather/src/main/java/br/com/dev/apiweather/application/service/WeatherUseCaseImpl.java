package br.com.dev.apiweather.application.service;

import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gtbr.ViaCepClient;
import com.gtbr.domain.Cep;
import com.gtbr.exception.ViaCepException;

import br.com.dev.apiweather.application.exception.CityNotFoundException;
import br.com.dev.apiweather.application.exception.ZipCodeNotFoundException;
import br.com.dev.apiweather.application.helper.Mapper;
import br.com.dev.apiweather.application.helper.Utils;
import br.com.dev.apiweather.application.port.in.WeatherUseCase;
import br.com.dev.apiweather.application.port.out.GetWeatherCityPortOut;
import br.com.dev.apiweather.domain.dto.feing.openweathermap.WeatherDataDTO;
import br.com.dev.apiweather.domain.dto.internal.WeatherForecastDTO;
import feign.FeignException;

@Service
public class WeatherUseCaseImpl implements WeatherUseCase {

	@Autowired
	private GetWeatherCityPortOut getWeatherCityPortOut;

	@Override
	public WeatherForecastDTO getWeather(String string) throws URISyntaxException {
		
		try {
			
			var weatherDto = new WeatherForecastDTO();
			var weatherData = new WeatherDataDTO();
			var zipCode = new Cep();
			
			if(!Utils.isNumeric(string)) {
				
				weatherData = getWeatherCityPortOut.getWeatherCity(string);
				
				
			} else {
				
				zipCode = ViaCepClient.findCep(string);
				weatherData = getWeatherCityPortOut.getWeatherCity(zipCode.getLocalidade());
			}
			
			return Mapper.mapperWeatherDatatoWeatherDto(weatherData, weatherDto, zipCode);
			
		} catch (FeignException e) {
			throw new CityNotFoundException("The city of '" + string + "' was not found");
		} catch (ViaCepException e) {
			throw new ZipCodeNotFoundException("The zip code of '" + string + "' was not found");
		}



	}

}
