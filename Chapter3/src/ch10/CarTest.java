package ch10;

public class CarTest {

	public static void main(String[] args) {

		Car aiCar = new AICar();
		
		aiCar.run();
		
		Car car = new ManualCar();
		
		car.run();
	}

}
