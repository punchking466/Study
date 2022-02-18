package ch07;

public class DoubleTest {
	public static void main(String[] args) {
		
		double dnum = 3.14;
		float fnum = 3.14f;
		
		System.out.println(dnum + "\n" + fnum);
		
		dnum = 1;
		
		for(int i = 0; i<10000 ; i++) {
			dnum += 0.1;
			System.out.println(dnum);
		}
	}
}
