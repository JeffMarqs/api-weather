package br.com.dev.apiweather.domain.entities;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Main {
	
	private Long temp;
	private Long feelsLike;
	private Long tempMin;
	private Long tempMax;
	private Integer pressure;
	private Integer humidity;

}
