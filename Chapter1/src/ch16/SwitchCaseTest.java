package ch16;

import java.util.Scanner;

public class SwitchCaseTest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이번달은 몇월입니까? : ");
		
		try {
			int month = scanner.nextInt();
		}catch(Exception e){
			System.out.println("올바른 값을 입력하세요");
		}
		
		/*
		int day = switch (month) {
    	case 1, 3, 5, 7, 8, 10,12 -> {
    		System.out.println("한 달은 31일입니다."); 
    		yield 31;
    	}
    	case 4,6,9,11 -> {
    		System.out.println("한 달은 30일입니다."); 
    		yield 30;
    	}
    	case 2 ->{
    		System.out.println("한 달은 28일입니다.");
    		yield 28;
    	}
    	default->{
    		System.out.println("존재하지 않는 달 입니다."); 
    		yield 0;
    	}
	};
*/
		/*
		switch(month) {
			case 1: case 3 : case 5 : case 7 : case 8 : case 10 : case 12:
				day = 31;
			
			break;
			
			case 4: case 6: case 9: case 11:
				day = 30;
				
				break;
			
			case 2:
				day = 28;
				
				break;
				
			default: 
				day  = 0;
				System.out.println("존재하지 않는 달입니다.");
		}
		*/
		
		//System.out.println(month + "월은 " + day +"일까지 존재합니다." );
		
		
	}
}
