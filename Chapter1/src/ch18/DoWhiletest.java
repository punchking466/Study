package ch18;

import java.util.Scanner;

public class DoWhiletest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int input;
		int sum =0;
		
		System.out.println("5���� ���ڸ� �Է��ϼ���");
		do {
			
			input = scanner.nextInt();
			
			sum += input;
		}while(input != 0);
		
		System.out.println("Sum : "+ sum);
	}
}
