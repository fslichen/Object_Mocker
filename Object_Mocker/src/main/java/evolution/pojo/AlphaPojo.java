package evolution.pojo;

public class AlphaPojo extends AbstractPojo {
	private String address;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return address + getName() + getAge();
	}
	
}
