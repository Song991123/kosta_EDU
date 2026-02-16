package ex0213_송정현.chapter8_solution6;
/**
 * 문제 6번 : Soundable 인터페이스는 다음과 같은 sound() 추상 메소드를 가지고 있습니다.
 * SoundableExample 클래스의 printSound() 메소드는 매개변수 타입으로 Soundable 인터페이스를 가집니다.
 * printSound()를 호출할 때 Cat과 Dog 객체를 주고 실행하면 각각 "야옹"과 "멍멍"이 출력되도록 Cat과 Dog 클래스를 작성해보세요.
 * */
public class SoundableExample {
	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}

}
