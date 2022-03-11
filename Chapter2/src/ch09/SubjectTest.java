package ch09;

public class SubjectTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "Lee");
		studentLee.setKoreaSubject("국어", 100);
		studentLee.setMathSubject("수학", 98);
		
		
		Student studentKim = new Student(200, "Kim");
		studentKim.setKoreaSubject("국어", 10);
		studentKim.setMathSubject("수학", 59);
		
		studentLee.showScoreInfo();
		studentKim.showScoreInfo();
	}

}
