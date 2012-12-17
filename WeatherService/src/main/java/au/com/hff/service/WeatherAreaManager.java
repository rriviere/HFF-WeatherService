package au.com.hff.service;

import java.util.List;

import au.com.hff.form.WeatherArea;


/**
 * @author richard.riviere
 *
 */
public interface WeatherAreaManager {
	public WeatherArea getWeatherArea(String area);
	public List<WeatherArea> getWeatherAreas();
}
