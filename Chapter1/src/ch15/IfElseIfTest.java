package ch15;

public class IfElseIfTest {
	public static void main(String[] args) {
		
		int age =19;
		int charge;
		
		if(age < 8) {
			charge = 1000;
			
			System.out.println("미취학 아동입니다.");
		}
		else if(age < 14) {
			charge = 1250;
			
			System.out.println("초등학생 입니다.");
		}
		else if(age < 17) {
			charge = 1300;
			
			System.out.println("중학생 입니다.");
		}
		else if(age < 20) {
			charge = 1400;
			
			System.out.println("고등학생입니다.");
		}
		else{
			charge = 1500;
			
			System.out.println("성인입니다.");
		}
		
		System.out.println("입장료는 "+ charge + "입니다");
	}
}
