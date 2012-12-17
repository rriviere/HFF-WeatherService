package au.com.hff.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import au.com.hff.form.WeatherForecast;
import au.com.hff.service.WeatherForecastManager;

@Controller
@RequestMapping("/weatherForecast")
public class WeatherForecastController {

	@Autowired
	private WeatherForecastManager forecastManager;
	
	@RequestMapping(value="/single/{areaCode}/{forecastDate}", method = RequestMethod.GET)
	public @ResponseBody WeatherForecast getWeatherForecast(
			@PathVariable String areaCode,
			@PathVariable String forecastDate) {
		WeatherForecast forecast = forecastManager.getForecast(areaCode,forecastDate);
		return forecast;
	} 
	
	/*@RequestMapping(value = "/all", method = RequestMethod.GET)
	public @ResponseBody List<WeatherArea> getWeatherAreas() {
		List<WeatherForecast> forecasts = forecastManager.getWeatherAreas();
		return forecasts;
	} 	*/
}