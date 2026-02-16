package ex0213_송정현.chapter8_solution5;
/**
 * 문제 5번 : TV 클래스를 실행했을 때 "TV를 켰습니다." 라고 출력되도록
 * 밑줄과 박스에 들어갈 코드를 작성해 보세요.
 * */
public class TV implements Remocon {
	/////////////// [빈칸박스] ///////////////
	@Override
	public void powerOn() {
		System.out.println("TV를 켰습니다.");

	}
	/////////////////////////////////////////
	
	
	public static void main(String[] args) {
		Remocon r = new TV();
		r.powerOn();
	}

}
