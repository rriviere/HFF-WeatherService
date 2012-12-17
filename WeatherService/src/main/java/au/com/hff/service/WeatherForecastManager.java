package au.com.hff.service;

import au.com.hff.form.WeatherForecast;

/**
 * @author richard.riviere
 *
 */
public interface WeatherForecastManager {
	public WeatherForecast getForecast(String areaCode, String forecastDate);
}
