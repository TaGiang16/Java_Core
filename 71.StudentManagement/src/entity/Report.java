package entity;

public class Report {
	private String studentName;
	private String courseName;
	private int totalCourse;

	public Report() {
	}

	public Report(String studentName, String courseName, int totalCourse) {
		if(studentName == null || studentName.trim().isEmpty()) {
			throw new IllegalArgumentException("cannot null");
		}
		if(courseName == null || courseName.trim().isEmpty()) {
			throw new IllegalArgumentException("cannot null");
		}
		if(totalCourse<=0) {
			throw new IllegalArgumentException("greater than 0");
		}
		this.studentName = studentName;
		this.courseName = courseName;
		this.totalCourse = totalCourse;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getTotalCourse() {
		return totalCourse;
	}

	public void setTotalCourse(int totalCourse) {
		this.totalCourse = totalCourse;
	}
}
