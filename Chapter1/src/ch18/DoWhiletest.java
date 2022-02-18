package ch18;

import java.util.Scanner;

public class DoWhiletest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int input;
		int sum =0;
		
		System.out.println("5개의 숫자를 입력하세요");
		do {
			
			input = scanner.nextInt();
			
			sum += input;
		}while(input != 0);
		
		System.out.println("Sum : "+ sum);
	}
}
