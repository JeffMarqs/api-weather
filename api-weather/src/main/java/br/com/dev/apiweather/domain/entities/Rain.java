package br.com.dev.apiweather.domain.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rain {

	@JsonProperty(value = "1h")
	private Long OneH;
}
