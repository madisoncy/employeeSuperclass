package employeeSuperclass;

public class Test {

	public static void main(String[] args) {
		
		Manager manage = new Manager();
		manage.setFirstName("Madison");
		manage.setLastName("Ytterock");
		manage.setEmployeeID(3737);
		manage.setSalary(50000);
		manage.setDepartment("Public Relations");
		manage.employeeSummary();
		
	}

}
