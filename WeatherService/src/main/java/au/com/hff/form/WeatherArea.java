package au.com.hff.form;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

import au.com.hff.dao.DAOConstants;

@NamedNativeQueries({
	@NamedNativeQuery(
	name = DAOConstants.HFF_GET_WEATHER_AREA_PROC_NAME,
	query = DAOConstants.HFF_GET_WEATHER_AREA_PROC_DEF,
	resultClass = WeatherArea.class
	)
})
@Entity
@Table(name=DAOConstants.HFF_WEATHER_AREA_TABLE_NAME)
public class WeatherArea {
	@Id
	@Column(name=DAOConstants.HFF_WEATHER_AREA_AREA_COL_NAME)
	@GeneratedValue
	String aac; 			// a code for the area
	
	@Column(name=DAOConstants.HFF_WEATHER_AREA_DESCRIPTION_COL_NAME)
	String description;		// Victoria
	
	@Column(name=DAOConstants.HFF_WEATHER_AREA_TYPE_COL_NAME)
	String type;			// region, metropolitan
	
	@Column(name=DAOConstants.HFF_WEATHER_AREA_PARENTAREA_COL_NAME)
	String parentAAC;		// a code for the parent area	
	
	/**
	 * @return the aac
	 */
	public String getAac() {
		return aac;
	}
	/**
	 * @param aac the aac to set
	 */
	public void setAac(String aac) {
		this.aac =  aac;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the parentAAC
	 */
	public String getParentAAC() {
		return parentAAC;
	}
	/**
	 * @param parentAAC the parentAAC to set
	 */
	public void setParentAAC(String parentAAC) {
		this.parentAAC = parentAAC;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	public String toString(){
		StringBuffer strb = new StringBuffer();
		strb.append(aac);
		strb.append(description);
		strb.append(type);
		strb.append(parentAAC);
		return strb.toString();
	}
}
