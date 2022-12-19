package array;

import java.util.ArrayList;

public class ArrayListEx3 {

	public static void main(String[] args) {
		ArrayList<Student> studentArrayList  = new ArrayList<>();
		studentArrayList.add(new Student(1001,"James"));
		studentArrayList.add(new Student(1002,"Tomas"));
		studentArrayList.add(new Student(1003,"Edward"));
		
		for(Student s : studentArrayList)
			s.showStudentInfo();

	}

}
