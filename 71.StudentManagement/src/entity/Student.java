package entity;

public class Student {
	private int id;
	private String studentName;
	private int semester;
	private String courseName;
	
	
	public Student() {
	}

	public Student(int id, String studentName, int semester, String courseName) {
		if (id <= 0) {
			throw new IllegalArgumentException("id must be greater than 0");
		}
		if (studentName == null || studentName.trim().isEmpty()) {
			throw new IllegalArgumentException("studentName cannot be null or empty");
		}
		if (semester < 1) {
			throw new IllegalArgumentException("semester must be greater than 1");
		}
		if (courseName == null || courseName.trim().isEmpty()) {
			throw new IllegalArgumentException("courseName cannot be null or empty");
		}
		this.id = id;
		this.studentName = studentName;
		this.semester = semester;
		this.courseName = courseName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}
