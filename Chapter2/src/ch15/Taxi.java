package ch15;

public class Taxi {
	
	private String companyName;
	private int money;
	
	public Taxi(String companyName, int money) {
		this.companyName = companyName;
		this.money = money;
	}
	
	public void take(int money) {
		this.money += money;
	}
	
	public void taxiShowInfo() {
		System.out.println(companyName + "택시 수입은 " + money + "입니다.");
	}
}
