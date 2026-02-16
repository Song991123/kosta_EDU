package ex0213_송정현.chapter8_solution8;
/**
 * 문제 8번 : 다음과 같이 인터페이스와 클래스가 선언되어 있습니다. 
 * action() 메소드를 호출할 때 매개값이 C객체일 경우에만 method2()가 호출이 되도록 밑줄에 들어갈 코드를 작성해 보세요.
 * */
public class Example {
	public static void action(A a) {
		a.method1();
		///////// [if 안쪽 조건문이 빈칸] /////////////
		if(a instanceof C c) {
			c.method2();
		}
	}
	public static void main(String[] args) {
		action(new B());
		action(new C());
	}

}
