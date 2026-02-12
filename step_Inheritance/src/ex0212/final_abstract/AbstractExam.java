package ex0212.final_abstract;

abstract class Animal{
	int legs;
	public abstract void sound();
	public abstract void run();
	
	public void eat() {
		System.out.println("잘 먹는다");
	}
}
//////////////////////////////////
class Dog extends Animal{

	@Override
	public void sound() {
		System.out.println("멍멍");
	}

	@Override
	public void run() {
		System.out.println("잘 뜀");	
	}
}
//////////////////////////////////
class Cat extends Animal{

	@Override
	public void sound() {
	System.out.println("야옹");
	
	}
	
	@Override
	public void run() {
	System.out.println("잘 뛰고 잘 올라감");
	
	}

}
//////////////////////////////
class Pig extends Animal{

	@Override
	public void sound() {
		System.out.println("꿀꿀");
		
	}

	@Override
	public void run() {
		System.out.println("모든 걸 잘 먹음");
		
	}
	
}

public class AbstractExam {
	public static void test(Animal animal) {
		animal.eat();
		animal.run();
		animal.sound();
		System.out.println("---------------");
	}
	
	public static void main(String[] args) {
		Animal animal = new Dog();
		
		animal = new Pig();
		test(animal);
		animal = new Cat();
		test(animal);
		
		
		
	}

}
