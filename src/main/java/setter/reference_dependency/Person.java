package setter.reference_dependency;

public class Person {
	private int personid; //primitive dependency
	private String personname; // primitive dependency
	private Address address; // referenece dependecy

	public int getPersonid() {
		return personid;
	}

	public void setPersonid(int personid) {
		this.personid = personid;
	}

	public String getPersonname() {
		return personname;
	}

	public void setPersonname(String personname) {
		this.personname = personname;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [personid=" + personid + ", personname=" + personname + ", address=" + address + "]";
	}
	
	

}
