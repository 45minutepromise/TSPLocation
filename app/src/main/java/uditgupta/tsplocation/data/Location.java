package uditgupta.tsplocation.data;

/**
 * Created by udigupta on 9/14/15.
 */
public class Location {

	private String latitude;
	private String longitude;
	private String bearing;

	public String getBearing() {
		return bearing;
	}

	public Location setBearing(String bearing) {
		this.bearing = bearing;
		return this;
	}

	public String getLatitude() {
		return latitude;
	}

	public Location setLatitude(String latitude) {
		this.latitude = latitude;
		return this;
	}

	public String getLongitude() {
		return longitude;
	}

	public Location setLongitude(String longitude) {
		this.longitude = longitude;
		return this;
	}
}
