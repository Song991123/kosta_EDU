package ex0224;

/**
 * 숫자를 100번 출력하는 스레드  - 상속
 * */
class NumberThread extends Thread{
	int sum;
	// 스레드에 이름을 붙일 수 있다. 다음과 같이 설정
	public NumberThread(String name) {
		super(name);
	}
	
	/**
	 * 스레드로 동작할 기능을 작성
	 * */
	@Override
	public void run() {
		for(int i = 0; i <= 100; i++) {
			System.out.println(super.getName() + " ==> " + i);
			sum += i;
			
//			Thread.yield(); // 스레드 양보.
			try {
				Thread.sleep((int)(Math.random() * 100)); // 0.01초 정지 상태 -> 1초 지나면 Runable 상태로 감
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
		System.out.println(super.getName() + " END -------");
	}
	
}
/**
 * Alpha를 출력하는 스레드 = 구현
 * */
class AlpahThread implements Runnable{

	@Override
	public void run() {
		Thread th = Thread.currentThread(); // 현재 스레드 객체
		
		for(char ch = 'A'; ch <= 'z'; ch++){ // 65 ~122
			System.out.println(th.getName() + " ==> " + ch);
		
		}
//		Thread.yield(); // 스레드 양보. 
		
		System.out.println(th.getName() + " END --------------");
	}
	
}

///////////////////////////////////////////////////////////////////
public class ThreadExam {

	public static void main(String[] args) {
		System.out.println("-- 메인 시작 --");
		
		NumberThread th1 = new NumberThread("첫번째 스레드");
		NumberThread th2 = new NumberThread("두번째 스레드");
		
		Thread 				th3 = new Thread(new AlpahThread(), "세번째 스레드");
		
		// run()을 직접 호출하면 새로운 스레드가 생성되지 않는다.
		// main 스레드(즉, 싱글 스레드)에서 일반 메서드처럼 순차적으로 실행된다.
		// 멀티스레드로 동작하려면 start()를 호출해야 한다.
		// 즉, start()가 스레드를 만드는 버튼이고
		// run()은 스레드가 실행할 내용일 뿐이다
//		th1.run();
//		th2.run();
//		th3.run();
		
		th1.start();
		th2.start();
		th3.start();
		
		// 우리의 기대와는 다르게 메인 스레드에 선언된거라 메인이 일을 빨리 끝내서 총합이 제대로 출력이 안됨.
//		System.out.println("총합" + th1.sum);
		
		// 만약 th1이 다 끝날때까지는 일을 안하도록 하고 싶을 경우
//		try {
//			th1.join(); // 이게 일을 마무리할때까지 메인스레드 얼음
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("총합" + th1.sum);
		
		
		System.out.println("-- 메인 종료 --");
	}

}
