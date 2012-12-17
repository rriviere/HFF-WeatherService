package au.com.hff.form;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

import au.com.hff.dao.DAOConstants;
import au.com.hff.dao.key.CompoundWeatherForecastKey;

/**
 * @author richard.riviere
 *
 */

@NamedNativeQueries({
	@NamedNativeQuery(
	name = DAOConstants.HFF_GET_WEATHER_FORECAST_PROC_NAME,
	query = DAOConstants.HFF_GET_WEATHER_FORECAST_PROC_DEF,
	resultClass = WeatherForecast.class
	)
})
@Entity
@Table(name=DAOConstants.HFF_WEATHER_FORECAST_TABLE_NAME)
public class WeatherForecast {
	
	@Id
	CompoundWeatherForecastKey weatherForecastKey;
	   
    @Column(name=DAOConstants.HFF_WEATHER_FORECAST_ELEMENTNAME_COL_NAME)
    String elementName;
    
    @Column(name=DAOConstants.HFF_WEATHER_FORECAST_ELEMENTUNIT_COL_NAME)
    String elementUnit;
    
    @Column(name=DAOConstants.HFF_WEATHER_FORECAST_ELEMENTVALUE_COL_NAME)
    String elementValue;

	public CompoundWeatherForecastKey getWeatherForecastKey() {
		return weatherForecastKey;
	}

	public void setWeatherForecastKey(CompoundWeatherForecastKey weatherForecastKey) {
		this.weatherForecastKey = weatherForecastKey;
	}

	public String getElementName() {
		return elementName;
	}

	public void setElementName(String elementName) {
		this.elementName = elementName;
	}

	public String getElementUnit() {
		return elementUnit;
	}

	public void setElementUnit(String elementUnit) {
		this.elementUnit = elementUnit;
	}

	public String getElementValue() {
		return elementValue;
	}

	public void setElementValue(String elementValue) {
		this.elementValue = elementValue;
	}
    
}
