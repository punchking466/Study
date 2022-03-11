package ch12;

public class Person {
	
	String name;
	int age;
	
	public Person() {
		this("�̸�����", 0);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showPerson() {
		System.out.println(name + ", " + age);
	}
	
	public Person getPerson() {
		return this;
	}
	
	public static void main(String[] args) {
		
		Person person = new Person();

		System.out.println(person);
		person.showPerson();
		
		Person person2 = person.getPerson();
		
		System.out.println(person2);
	}
}
