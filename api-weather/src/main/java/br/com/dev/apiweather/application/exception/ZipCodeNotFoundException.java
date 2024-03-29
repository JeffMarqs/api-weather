package br.com.dev.apiweather.application.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ZipCodeNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ZipCodeNotFoundException(String msg) {
		super(msg);
	}

}
