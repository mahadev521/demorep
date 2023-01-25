package homeTasks;

public class JuniorEngineer extends Employee {
	private int assessmentScore;
	private String feedback;

	JuniorEngineer(int empId, String name, int salary) {
		super(empId, name, salary);
	}

	JuniorEngineer(int empId, String name, int salary, int assessmentScore, String feedback) {
		super(empId, name, salary);
		this.assessmentScore = assessmentScore;
		this.feedback = feedback;
	}

	public int getAssessmentScore() {
		return assessmentScore;
	}

	public void setAssessmentScore(int assessmentScore) {
		this.assessmentScore = assessmentScore;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
}
