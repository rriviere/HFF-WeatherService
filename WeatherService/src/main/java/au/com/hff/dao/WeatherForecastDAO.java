package au.com.hff.dao;

import au.com.hff.form.WeatherForecast;

public interface WeatherForecastDAO {
	public WeatherForecast getForecast(String areaCode, String forecastDate);
}
