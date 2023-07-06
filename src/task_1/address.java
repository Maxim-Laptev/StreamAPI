package task_1;

public class address {
	private String city,region;
	public address(String region,String city) {
		this.region=region;
		this.city=city;
	}
	public String getRegion() {
		return this.region;
	}
	public String getCity() {
		return this.city;
	}
	@Override
	public String toString() {
		return getRegion()+", "+getCity();
	}
}
