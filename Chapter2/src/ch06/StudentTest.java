package ch06;

public class StudentTest {
	public static void main(String[] args) {
		
		Student studentKim = new Student();
		
		Student studentLee = new Student(12345, "Lee", 3);
		
		System.out.println(studentKim.showStudentInfo()+"\n\n");
		System.out.println(studentLee.showStudentInfo());
		
		
		
	}
}
