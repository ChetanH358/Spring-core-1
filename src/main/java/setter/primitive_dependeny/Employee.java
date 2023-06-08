package setter.primitive_dependeny;

public class Employee {
//	premitive depedencies (8+String)
	private int id;
	private String ename;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("setting the id");
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		System.out.println("setting the name");
		this.ename = ename;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + "]";
	}
	
	

}
