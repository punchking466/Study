package ch14;

public class Bus {

	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int bussNumber) {
		this.busNumber = bussNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showBusInfo() {
		
		System.out.println(busNumber + "���� �°� ���� " + passengerCount + "�� �̰�, ������ " +money + "�� �Դϴ�.");
	}
}
