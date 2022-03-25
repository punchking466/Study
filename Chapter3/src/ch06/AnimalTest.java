package ch06;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}
 
 class Human extends Animal {

	@Override
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}
	
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
	 
 }
 
 class Tiger extends Animal{

	@Override
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�");
	}
	
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
	 
 }
 
 class Eagle extends Animal{
	 
	 public void move() {
		 System.out.println("�������� �ϴ��� ���� �ٴմϴ�.");
	 }
	 
	 public void flying() {
		 System.out.println("�������� �糯���� �� ��� ���ƴٴմϴ�.");
	 }
 }

public class AnimalTest {
		
	public static void main(String[] args) {

		Animal hAnimla = new Human();
		Animal tAnimla = new Tiger();
		Animal eAnimla = new Eagle();
		
//		AnimalTest test = new AnimalTest();
//		test.moveAnimal(hAnimla);
//		test.moveAnimal(tAnimla);
//		test.moveAnimal(eAnimla);
		
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(hAnimla);
		animalList.add(tAnimla);
		animalList.add(eAnimla);
		
		for(Animal animal : animalList) {
			animal.move();
		}
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
		
	}

}
