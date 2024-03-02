package br.com.dev.apiweather.application.helper;

import java.util.regex.Pattern;

public class Utils {
	
	public static boolean isNumeric(String string) {
		return Pattern.compile(".*\\d.*").matcher(string).matches();
	}

}
