package ex0213_송정현.interface_ex.sec12;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");

	}
	
	public void checkFare() {
		System.out.println("승차 요급을 체크합니다.");
	}
}
