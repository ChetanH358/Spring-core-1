package setter.collection.set_type_dependency;

import java.util.Set;

public class Company {
	private int companyid;
	private String companyname;
	
//	only Storing multiple employee names by specifiying generic's as string 
//	it is a collection dependency (List-Type,Set-Type,Map-Type)
	
	private Set<String> employees;

	public int getCompanyid() {
		return companyid;
	}

	public void setCompanyid(int companyid) {
		this.companyid = companyid;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public Set<String> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<String> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Company [companyid=" + companyid + ", companyname=" + companyname + ", employees=" + employees + "]";
	}

}
