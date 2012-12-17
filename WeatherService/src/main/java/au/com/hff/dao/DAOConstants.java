
package au.com.hff.dao;

/**
 * @author richard.riviere
 *
 */
public class DAOConstants {
	
	public static final String MYSQL_CALL_KEYWORD = "CALL";
	public static final String MYSQL_BIND_PARAM = ":";
	public static final String MYSQL_PARAM_SEPERATOR = ",";
	
	//weather areas	
	public static final String HFF_WEATHER_AREA_TABLE_NAME ="HFF_WEATHER_AREA";
	public static final String HFF_WEATHER_AREA_AREA_COL_NAME = "AREA";
	public static final String HFF_WEATHER_AREA_DESCRIPTION_COL_NAME = "DESCRIPTION";
	public static final String HFF_WEATHER_AREA_TYPE_COL_NAME = "TYPE";
	public static final String HFF_WEATHER_AREA_PARENTAREA_COL_NAME = "PARENT_AREA";
	
	public static final String HFF_GET_WEATHER_AREA_PROC_PARAM1 = "I_area_code";
	public static final String HFF_GET_WEATHER_AREA_PROC_NAME = "getWeatherAreasStoredProc";
	public static final String HFF_GET_WEATHER_AREA_PROC_DEF = 
			"CALL hff.hff_get_weather_area_proc(" + MYSQL_BIND_PARAM + HFF_GET_WEATHER_AREA_PROC_PARAM1 +")";

	//weather forecasts     
	public static final String HFF_WEATHER_FORECAST_TABLE_NAME ="HFF_WEATHER_FORECAST";
	public static final String HFF_WEATHER_FORECAST_START_TIME_LOCAL_COL_NAME = "START_TIME_LOCAL";
	public static final String HFF_WEATHER_FORECAST_END_TIME_LOCAL_COL_NAME = "END_TIME_LOCAL";
	public static final String HFF_WEATHER_FORECAST_TIME_ZONE_COL_NAME = "TIME_ZONE";
	public static final String HFF_WEATHER_FORECAST_AREA_COL_NAME = "AREA";
	public static final String HFF_WEATHER_FORECAST_ELEMENTNAME_COL_NAME = "ELEMENT_NAME";
	public static final String HFF_WEATHER_FORECAST_ELEMENTUNIT_COL_NAME = "ELEMENT_UNIT";
	public static final String HFF_WEATHER_FORECAST_ELEMENTVALUE_COL_NAME = "ELEMENT_VALUE";
	
	public static final String HFF_GET_WEATHER_FORECAST_PROC_PARAM1 = "I_area_code";
	public static final String HFF_GET_WEATHER_FORECAST_PROC_PARAM2 = "I_date";
	public static final String HFF_GET_WEATHER_FORECAST_PROC_NAME = "getWeatherForecastStoredProc";
	public static final String HFF_GET_WEATHER_FORECAST_PROC_DEF = 
			"CALL hff.hff_get_weather_forecast_proc(" + 
					MYSQL_BIND_PARAM + 
					HFF_GET_WEATHER_FORECAST_PROC_PARAM1 +
					MYSQL_PARAM_SEPERATOR +
					MYSQL_BIND_PARAM + HFF_GET_WEATHER_FORECAST_PROC_PARAM2 + ")";
	
}
