package au.com.hff.dao.key;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import au.com.hff.dao.DAOConstants;


/**
 * @author richard.riviere
 *
 */

@Embeddable
public class CompoundWeatherForecastKey implements Serializable{
	
	private static final long serialVersionUID = 6326095435967560037L;
	
	@Column(name=DAOConstants.HFF_WEATHER_FORECAST_START_TIME_LOCAL_COL_NAME)
	String startTimeLocal;
	
	@Column(name=DAOConstants.HFF_WEATHER_FORECAST_END_TIME_LOCAL_COL_NAME) 
    String endTimeLocal;
	
	@Column(name=DAOConstants.HFF_WEATHER_FORECAST_TIME_ZONE_COL_NAME)
    String timeZone;
	
	@Column(name=DAOConstants.HFF_WEATHER_AREA_AREA_COL_NAME)
    String area;
    
	public String getStartTimeLocal() {
		return startTimeLocal;
	}
	public void setStartTimeLocal(String startTimeLocal) {
		this.startTimeLocal = startTimeLocal;
	}
	public String getEndTimeLocal() {
		return endTimeLocal;
	}
	public void setEndTimeLocal(String endTimeLocal) {
		this.endTimeLocal = endTimeLocal;
	}
	public String getTimeZone() {
		return timeZone;
	}
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}

}
