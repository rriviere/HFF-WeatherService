package au.com.hff.dao;

import java.util.List;

import au.com.hff.form.WeatherArea;


/**
 * @author richard.riviere
 *
 */
public interface WeatherAreaDAO {
	public WeatherArea getWeatherArea(String area);
	public List<WeatherArea> getWeatherAreas();
}
