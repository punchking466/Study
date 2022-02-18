package ch14;

import java.util.Scanner;

public class IfElseTest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("당신은 몇살입니까? : \n");
		int age = scanner.nextInt();
		
		if(age > 8) {
			System.out.println("학교에 다닐 나이입니다!");
		}else {
			System.out.println("학교에 다닐 나이가 아닙니다!");
		}
	}
}
