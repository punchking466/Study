package ch15;

public class TaxiTest {

	public static void main(String[] args) {

		Student student = new Student();
		
		student.setStudentName("Edward");
		student.setMoney(20000);
		
		Taxi taxi = new Taxi("잘나간다 운수", 20000);
		
		student.takeTaxi(taxi);
		student.showInfo();
		
		taxi.taxiShowInfo();
	}

}
