package ch21;

public class ContinueTest {
	public static void main(String[] args) {
		
		int sum = 0;
		int num;
		
		for(num = 0 ; ; num++) {
			sum += num;

			if(sum >=100) break;
			
		}
		
		System.out.println("sum = "+ sum);
		System.out.println("num = "+ num);
	}
}
