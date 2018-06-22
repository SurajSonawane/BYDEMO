

public class TryPojo {
	
	
	private int empId;
	private String empName;
	private String address;
	private double salary;
	
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "TryPojo [empId=" + empId + ", empName=" + empName + ", address=" + address + ", salary=" + salary + "]";
	}
	public TryPojo(int empId, String empName, String address, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
		this.salary = salary;
	}
	public TryPojo() {
		super();
	}
	
}
