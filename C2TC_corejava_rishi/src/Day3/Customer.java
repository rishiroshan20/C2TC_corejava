package Day3;

public class Customer {
	
	private int cid;
	private String name;
	private String city;
	
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void display() {
        System.out.println("Cid = " + cid + ", Name = " + name + ", City = " + city);
    
	}
}
