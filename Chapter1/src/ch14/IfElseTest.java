package ch14;

import java.util.Scanner;

public class IfElseTest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("����� ����Դϱ�? : \n");
		int age = scanner.nextInt();
		
		if(age > 8) {
			System.out.println("�б��� �ٴ� �����Դϴ�!");
		}else {
			System.out.println("�б��� �ٴ� ���̰� �ƴմϴ�!");
		}
	}
}
