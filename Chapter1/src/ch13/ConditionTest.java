package ch13;

import java.util.Scanner;

public class ConditionTest {
	public static void main(String[] args) {
		
		int max;
		System.out.println("�� ���� �Է� �޾Ƽ� ū ���� ����ϼ���");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ù��° �� : ");
		int num1 = scanner.nextInt();
		System.out.println("�ι�° �� : ");
		int num2 = scanner.nextInt();
		
		max = (num1 > num2) ? num1 : num2;
		
		System.out.println("��� : "+ max);
	}
}
