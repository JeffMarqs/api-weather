package br.com.dev.apiweather.domain.dto.feing.openweathermap;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sys {
	
	private Integer type;
	private Integer id;
	private String country;
	private Integer sunrise;
	private Integer sunset;

}
