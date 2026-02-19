package ex0219.lamda;

public class MainApp {

	public static void main(String[] args) {
		// Anonymous Inner Class type으로 작성 (익명타입 선언) =========
		AInterface ATest1 = new AInterface() {
			@Override
			public void aa() {
				System.out.println("Anonymous Inner Class로 호출");
			}
		};
		ATest1.aa();
		
		// 람다식 ========================================
		AInterface ATest2 = () -> System.out.println("[람다식 A]");
		ATest2.aa();
		
		BInterface BTest = (i) -> System.out.println("[람다식 B] 값: " + i);
		BTest.bb(10);
		
		CInterface CTest = (i, j) -> i + j;
		System.out.println("[람다식 C] 값: " + CTest.cc(5, 4));
	}
}
