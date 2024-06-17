package employeeSuperclass;

public class Employee {
	
	private String firstName;
	private String lastName;
	private int employeeID;
	private double salary;

	public Employee() {
		firstName = null;
		lastName = null;
		employeeID = 0;
		salary = 0.0;

	}

	public void setFirstName (String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setLastName (String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setEmployeeID (int employeeID) {
		this.employeeID = employeeID;
	}
	
	public int getEmployeeID() {
		return this.employeeID;
	}
	
	public void setSalary (double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public void employeeSummary() {
		System.out.println("Employee First Name: " + this.firstName);
		System.out.println("Employee Last Name: " + this.lastName);
		System.out.println("Employee ID Number: " + this.employeeID);
		System.out.println("Employee Salary: $" + this.salary);
	}
}
