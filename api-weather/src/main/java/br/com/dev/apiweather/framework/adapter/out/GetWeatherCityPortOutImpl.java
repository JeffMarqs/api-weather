package br.com.dev.apiweather.framework.adapter.out;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import br.com.dev.apiweather.application.port.out.GetWeatherCityPortOut;
import br.com.dev.apiweather.domain.entities.WeatherData;
import br.com.dev.apiweather.framework.adapter.out.client.WeatherFeign;

@Service
public class GetWeatherCityPortOutImpl implements GetWeatherCityPortOut {
	
	@Autowired
	private WeatherFeign weatherFeign;
	
	@Value("${OPENWEATHER.api_units}")
	private String units;
	
	@Value("${OPENWEATHER.api_key}")
	private String appid;
	

	@Override
	public WeatherData getWeatherCity(String city) {
		return weatherFeign.getWeatherData(city, units, appid);
	}

}
