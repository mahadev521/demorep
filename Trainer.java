package homeTasks;

import java.util.ArrayList;

public class Trainer extends Employee {
	private ArrayList<String> skills = new ArrayList<>();
	private ArrayList<String> certifications = new ArrayList<>();

	Trainer(int empId, String name, int salary) {
		super(empId, name, salary);
	}

	public ArrayList<String> getSkills() {
		return skills;
	}

	public void setSkills(ArrayList<String> skills) {
		this.skills = skills;
	}

	public ArrayList<String> getCertifications() {
		return certifications;
	}

	public void setCertifications(ArrayList<String> certifications) {
		this.certifications = certifications;
	}

	public void addSkill(String skill) {
		if (skills.isEmpty()) {
			skills = new ArrayList<>();
		}
		skills.add(skill);
	}

	public void removeSkill(String skill) throws Exception {
		if (skills.isEmpty()) {
			throw new Exception("Nothing to remove in skillset");
		}
		skills.remove(skill);
	}

	public void addCertification(String certificate) {
		if (certifications.isEmpty()) {
			certifications = new ArrayList<>();
		}
		certifications.add(certificate);
	}

	public void removeCertification(String certificate) throws Exception {
		if (certifications.isEmpty()) {
			throw new Exception("Nothing to remove in certifications");
		}
		certifications.add(certificate);
	}

	@Override
	public void printDetails() {
		System.out.println("Employee name: " + getName());
		System.out.println("Employee Id: " + getempId());
		System.out.println("Designation: Trainer");
		System.out.println("Skills: " + getSkills());
		System.out.println("Certifications: " + getCertifications());
		System.out.println("Salary: " + getSalary());
		System.out.println("Address\n" + getAddress());
	}
}
