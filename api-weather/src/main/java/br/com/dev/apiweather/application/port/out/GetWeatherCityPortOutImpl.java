package br.com.dev.apiweather.application.port.out;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dev.apiweather.domain.entities.WeatherData;
import br.com.dev.apiweather.framework.adapter.out.WeatherFeign;

@Service
public class GetWeatherCityPortOutImpl implements GetWeatherCityPortOut {
	
	private static final String units = "metric";
	private static final String appid = "ac8edcec2dcbc5661b8d16b799e7fa0c";
	
	@Autowired
	private WeatherFeign weatherFeign;

	@Override
	public WeatherData getWeatherCity(String city) {
		return weatherFeign.getWeatherData(city, units, appid);
	}

}
