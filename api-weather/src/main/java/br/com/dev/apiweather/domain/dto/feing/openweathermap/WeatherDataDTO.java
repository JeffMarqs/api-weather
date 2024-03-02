package br.com.dev.apiweather.domain.dto.feing.openweathermap;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeatherDataDTO {
	
	private Main main;
	private Sys sys;
	private String name;

}
