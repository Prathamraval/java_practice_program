package comparable_comparator.comparator;

public class Emp {
	int eId;
	String name;
	String phone;		

	public Emp(int eId, String name, String phone) {
		super();
		this.eId = eId;
		this.name = name;
		this.phone = phone;
	}
	
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Emp [eId=" + eId + ", name=" + name + ", phone=" + phone + "]";
	}
	
}
