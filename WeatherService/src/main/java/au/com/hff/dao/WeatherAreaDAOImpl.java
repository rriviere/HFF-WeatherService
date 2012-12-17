package au.com.hff.dao;

import java.util.List;


import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import au.com.hff.form.WeatherArea;

@Repository
public class WeatherAreaDAOImpl implements WeatherAreaDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public WeatherArea getWeatherArea(String areaStr){
		Query query = sessionFactory.getCurrentSession().
				getNamedQuery(DAOConstants.HFF_GET_WEATHER_AREA_PROC_NAME)
				.setParameter(DAOConstants.HFF_GET_WEATHER_AREA_PROC_PARAM1, areaStr);	
		List <WeatherArea>areaList = query.list();
		WeatherArea area = null;
		if (!areaList.isEmpty()){
			area = (WeatherArea)query.list().get(0);
		}
		return area;		
	}
	
	
	@SuppressWarnings("unchecked")
	public List<WeatherArea> getWeatherAreas(){				
		Query query = sessionFactory.getCurrentSession().
				getNamedQuery(DAOConstants.HFF_GET_WEATHER_AREA_PROC_NAME)
				.setParameter(DAOConstants.HFF_GET_WEATHER_AREA_PROC_PARAM1, null);	
		return query.list();
	}
}
