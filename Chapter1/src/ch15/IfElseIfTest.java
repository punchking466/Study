package ch15;

public class IfElseIfTest {
	public static void main(String[] args) {
		
		int age =19;
		int charge;
		
		if(age < 8) {
			charge = 1000;
			
			System.out.println("������ �Ƶ��Դϴ�.");
		}
		else if(age < 14) {
			charge = 1250;
			
			System.out.println("�ʵ��л� �Դϴ�.");
		}
		else if(age < 17) {
			charge = 1300;
			
			System.out.println("���л� �Դϴ�.");
		}
		else if(age < 20) {
			charge = 1400;
			
			System.out.println("����л��Դϴ�.");
		}
		else{
			charge = 1500;
			
			System.out.println("�����Դϴ�.");
		}
		
		System.out.println("������ "+ charge + "�Դϴ�");
	}
}
