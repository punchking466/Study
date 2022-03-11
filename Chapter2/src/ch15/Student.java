package ch15;

public class Student {
	
	private String studentName;
	private int money;
	

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;
	}
	
	public void showInfo() {
		System.out.println(studentName +"¥‘¿« ¿‹æ◊¿∫ " + money + "¿‘¥œ¥Ÿ.");
	}
}
