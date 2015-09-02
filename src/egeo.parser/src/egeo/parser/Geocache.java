package egeo.parser;

public class Geocache {

	String lat;
	String lon;
	String gccode;
	String name;
	String url;
	String time;
	long id;
	public boolean available;
	public boolean archived;
	public String placedBy;
	public User owner;
	public GcType type;
	public GcContainer container;

	@Override
	public String toString() {
		return "Geocache [lat=" + lat + ", lon=" + lon + ", gccode=" + gccode + ", name=" + name + ", url=" + url
				+ ", time=" + time + ", id=" + id + ", available=" + available + ", archived=" + archived
				+ ", placedBy=" + placedBy + ", owner=" + owner + ", type=" + type + ", container=" + container + "]";
	}

}
