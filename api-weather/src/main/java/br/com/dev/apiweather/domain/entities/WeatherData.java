package br.com.dev.apiweather.domain.entities;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeatherData {
	
	private Coord coord;
	private List<Weather> weather;
	private String base;
	private Main main;
	private Integer visibility;
	private Wind wind;
	private Rain rain;
	private Clouds clouds;
	private Integer dt;
	private Sys sys;
	private Integer timezone;
	private Integer id;
	private String name;
	private Integer cod;

}
