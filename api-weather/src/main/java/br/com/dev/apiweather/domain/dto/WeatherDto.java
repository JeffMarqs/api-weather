package br.com.dev.apiweather.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeatherDto {
	
	private String city;
	private String country;
	private String tempMax;
	private String tempMin;

}
