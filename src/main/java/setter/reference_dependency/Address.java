package setter.reference_dependency;

public class Address {
	private int pincode;
//	reference depedency -> (Achieveing Has-A-Reletationship)
	private String city;

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", city=" + city + "]";
	}

}
