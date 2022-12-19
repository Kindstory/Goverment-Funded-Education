package array;


public class Student {
	public int studentID;
	String studentName;
	
	public Student(int studentID, String studentName) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
	}

	void showStudentInfo() {
		System.out.println(studentID+", "+studentName);	
	}
	
	
}
