package au.com.hff.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import au.com.hff.form.WeatherArea;
import au.com.hff.service.WeatherAreaManager;

@Controller
@RequestMapping("/weatherArea")
public class WeatherAreaController {

	@Autowired
	private WeatherAreaManager areaManager;
	
	@RequestMapping(value="/single/{name}", method = RequestMethod.GET)
	public @ResponseBody WeatherArea getWeatherArea(@PathVariable String name) {
		WeatherArea area = areaManager.getWeatherArea(name);
		return area;
	} 
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public @ResponseBody List<WeatherArea> getWeatherAreas() {
		List<WeatherArea> areas = areaManager.getWeatherAreas();
		return areas;
	} 	
}
