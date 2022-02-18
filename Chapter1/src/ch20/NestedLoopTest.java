package ch20;

public class NestedLoopTest {
	public static void main(String[] args) {
		
		/*
		System.out.println("구구단을 외자!");
		
		for(int i=2; i<=9; i++) {
			
			for(int j=1; j<=9; j++) {
				System.out.println(i+ " X " + j +"= " + i*j);
			}
				System.out.println("");
		}
		*/
		
		System.out.println("구구단을 외자!\n");
		
		int i = 2;
		
		
		while(i <= 9) {
			int j = 1;
			System.out.println(i+"단");
			while(j<=9) {
				System.out.println(i+ " X " + j +"= " + i*j);
				j++;
			}
			System.out.println();
			i++;
		}
		
	}
}
