package ch10;

public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("����� �����մϴ�.");
		System.out.println("����� �ڵ��� �����մϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("��ֹ� �տ��� ����ϴ�.");
	}

	@Override
	public void wiper() {
		System.out.println("�����۸� �մϴ�.");
	}

}
