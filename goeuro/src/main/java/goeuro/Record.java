package goeuro;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Record {

	@SerializedName("_id")
	@Expose
	private Integer id;
	@SerializedName("key")
	@Expose
	private Object key;
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("fullName")
	@Expose
	private String fullName;
	@SerializedName("iata_airport_code")
	@Expose
	private Object iataAirportCode;
	@SerializedName("type")
	@Expose
	private String type;
	@SerializedName("country")
	@Expose
	private String country;
	@SerializedName("geo_position")
	@Expose
	private GeoPosition geoPosition;
	@SerializedName("location_id")
	@Expose
	private Integer locationId;
	@SerializedName("inEurope")
	@Expose
	private Boolean inEurope;
	@SerializedName("countryCode")
	@Expose
	private String countryCode;
	@SerializedName("coreCountry")
	@Expose
	private Boolean coreCountry;
	@SerializedName("distance")
	@Expose
	private Object distance;

	/**
	 * 
	 * @return The id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 *            The _id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 
	 * @return The key
	 */
	public Object getKey() {
		return key;
	}

	/**
	 * 
	 * @param key
	 *            The key
	 */
	public void setKey(Object key) {
		this.key = key;
	}

	/**
	 * 
	 * @return The name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 *            The name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return The fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * 
	 * @param fullName
	 *            The fullName
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * 
	 * @return The iataAirportCode
	 */
	public Object getIataAirportCode() {
		return iataAirportCode;
	}

	/**
	 * 
	 * @param iataAirportCode
	 *            The iata_airport_code
	 */
	public void setIataAirportCode(Object iataAirportCode) {
		this.iataAirportCode = iataAirportCode;
	}

	/**
	 * 
	 * @return The type
	 */
	public String getType() {
		return type;
	}

	/**
	 * 
	 * @param type
	 *            The type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * 
	 * @return The country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * 
	 * @param country
	 *            The country
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * 
	 * @return The geoPosition
	 */
	public GeoPosition getGeoPosition() {
		return geoPosition;
	}

	/**
	 * 
	 * @param geoPosition
	 *            The geo_position
	 */
	public void setGeoPosition(GeoPosition geoPosition) {
		this.geoPosition = geoPosition;
	}

	/**
	 * 
	 * @return The locationId
	 */
	public Integer getLocationId() {
		return locationId;
	}

	/**
	 * 
	 * @param locationId
	 *            The location_id
	 */
	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	/**
	 * 
	 * @return The inEurope
	 */
	public Boolean getInEurope() {
		return inEurope;
	}

	/**
	 * 
	 * @param inEurope
	 *            The inEurope
	 */
	public void setInEurope(Boolean inEurope) {
		this.inEurope = inEurope;
	}

	/**
	 * 
	 * @return The countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * 
	 * @param countryCode
	 *            The countryCode
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	/**
	 * 
	 * @return The coreCountry
	 */
	public Boolean getCoreCountry() {
		return coreCountry;
	}

	/**
	 * 
	 * @param coreCountry
	 *            The coreCountry
	 */
	public void setCoreCountry(Boolean coreCountry) {
		this.coreCountry = coreCountry;
	}

	/**
	 * 
	 * @return The distance
	 */
	public Object getDistance() {
		return distance;
	}

	/**
	 * 
	 * @param distance
	 *            The distance
	 */
	public void setDistance(Object distance) {
		this.distance = distance;
	}

}