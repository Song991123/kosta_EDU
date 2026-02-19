package ex0219.exam02;

public class MainApp {

	public static void main(String[] args) {
		// 상품 생성
		Product<Tv, String> p1 = new Product<>();
		p1.setKind(new Tv());
		p1.setModel("삼성 TV");
		
		Tv tv = p1.getKind();
		////////////////////////
		// Generic 타입은 반드시 객체 타입이어야 해서 int가 아닌 Integer이어야 한다.
		Product<Video, Integer> p2 = new Product<Video, Integer>();
		p2.setKind(new Video());
		p2.setModel(100); // Autoboxing
		
		Video v  = p2.getKind();
		int 	  it = p2.getModel();
	
	}
}
