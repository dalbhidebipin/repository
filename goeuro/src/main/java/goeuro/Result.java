package goeuro;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder(value = { "id", "name", "type", "latitude", "longitude"})
public class Result{
	private int id;
	private String name;
	private String type;
	private double longitude;
	private double latitude;
	public Result(int _id, String _name, String _type, double _longitude, double latitude){
		this.id = _id;
		this.name = _name;
		this.type = _type;
		this.longitude = _longitude;
		this.latitude = _longitude;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}
	
	public double getLongitude() {
		return longitude;
	}
	
	public double getLatitude() {
		return latitude;
	}
}
