package ch08;

public class CustomInfo {
	private static int age;
	private static int height;
	private static int weight;
	private static String name;
	private static String phoneNum;
	private static String address;
	
	public void CustomInfo(int age, int height, int weight, String name, String phoneNum, String address) {
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.name = name;
		this.phoneNum = phoneNum;
		this.address = address;
	}

	public static int getAge() {
		return age;
	}

	public static void setAge(int age) {
		CustomInfo.age = age;
	}

	public static int getHeight() {
		return height;
	}

	public static void setHeight(int height) {
		CustomInfo.height = height;
	}

	public static int getWeight() {
		return weight;
	}

	public static void setWeight(int weight) {
		CustomInfo.weight = weight;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		CustomInfo.name = name;
	}

	public static String getPhoneNum() {
		return phoneNum;
	}

	public static void setPhoneNum(String phoneNum) {
		CustomInfo.phoneNum = phoneNum;
	}

	public static String getAddress() {
		return address;
	}

	public static void setAddress(String address) {
		CustomInfo.address = address;
	}
	
	
	
}
