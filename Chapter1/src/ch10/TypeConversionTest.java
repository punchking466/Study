package ch10;

public class TypeConversionTest {

	public static void main(String[] args) {
		
		
		byte bNum = 10;
		int iNum = bNum;
		
		int iNum1 = 20;
		float fNum = iNum1;
		
		int iNum2 = 10;
		byte  bNum2 = (byte)iNum2;
		
		double dNum = 3.14;
		int idNum = (int)dNum;
		
		System.out.println(idNum);
	}

}
