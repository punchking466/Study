package ch10;

public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("사람이 운전합니다.");
		System.out.println("사람이 핸들을 조작합니다.");
	}

	@Override
	public void stop() {
		System.out.println("장애물 앞에서 멈춥니다.");
	}

	@Override
	public void wiper() {
		System.out.println("와이퍼를 켭니다.");
	}

}
