package au.com.hff.dao;

import java.util.HashMap;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import au.com.hff.form.WeatherForecast;

/**
 * @author richard.riviere
 *
 */
@Repository
public class WeatherForecastDAOImpl implements WeatherForecastDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public WeatherForecast getForecast(String areaCode, String forecastDate){

		HashMap<String, String> parameters = new HashMap<String, String>();
		parameters.put(DAOConstants.HFF_GET_WEATHER_FORECAST_PROC_PARAM1, "VIC_PT025");
		parameters.put(DAOConstants.HFF_GET_WEATHER_FORECAST_PROC_PARAM2, "14-11-2012");
		
		Query query = sessionFactory.getCurrentSession().
				getNamedQuery(DAOConstants.HFF_GET_WEATHER_FORECAST_PROC_NAME)
				.setProperties(parameters);
					
		System.err.print(query);
		List <WeatherForecast> forecastList = query.list();
		WeatherForecast forecast = null;
		if (!forecastList.isEmpty()){
			forecast = (WeatherForecast)query.list().get(0);
		}
		return forecast;		
	}	
}
