package homeTasks;

public class SoftwareEngineer extends Employee {
	private String projectName;

	SoftwareEngineer(int empId, String name, int salary) {
		super(empId, name, salary);
	}

	SoftwareEngineer(int empId, String name, int salary, String projectName) {
		super(empId, name, salary);
		this.projectName = projectName;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@Override
	public void printDetails() {
		System.out.println("Employee name: " + getName());
		System.out.println("Employee Id: " + getempId());
		System.out.println("Designation: Software Employee");
		System.out.println("Working project: " + getProjectName());
		System.out.println("Salary: " + getSalary() + "\n");
		System.out.println("Address\n" + getAddress());
	}
}
