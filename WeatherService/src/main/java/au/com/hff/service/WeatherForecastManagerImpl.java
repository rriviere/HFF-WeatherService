/**
 * 
 */
package au.com.hff.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import au.com.hff.dao.WeatherForecastDAO;
import au.com.hff.form.WeatherForecast;

/**
 * @author richard.riviere
 *
 */
@Service
public class WeatherForecastManagerImpl implements WeatherForecastManager{

	@Autowired
	private WeatherForecastDAO forecastDAO;
	
	@Transactional
	public WeatherForecast getForecast(String areaCode, String forecastDate){
		return forecastDAO.getForecast(areaCode, forecastDate);
	}
}
