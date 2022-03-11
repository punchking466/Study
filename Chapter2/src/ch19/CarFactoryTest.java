package ch19;

public class CarFactoryTest {

	public static void main(String[] args) {
		
		CarFactory factory = CarFactory.getInstance();
		Car mySonata = factory.CreateCar();
		Car yourSonata = factory.CreateCar();
		
		System.out.println(mySonata.getCarNum());
		System.out.println(yourSonata.getCarNum());
	}

}
