package au.com.hff.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import au.com.hff.dao.WeatherAreaDAO;
import au.com.hff.form.WeatherArea;


@Service
public class WeatherAreaManagerImpl implements WeatherAreaManager {

	@Autowired
	private WeatherAreaDAO areaDAO;

	@Transactional
	public WeatherArea getWeatherArea(String area){
		return areaDAO.getWeatherArea(area);
	}

	@Transactional
	public List<WeatherArea> getWeatherAreas() {
		return areaDAO.getWeatherAreas();
	}
}
