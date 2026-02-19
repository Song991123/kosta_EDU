package ex0219.exam01;

public class MainApp {

	public static void main(String[] args) {
		// 제네릭을 사용하지 않은 경우
//		Box box = new Box();
//		box.setContent("상품1");
//		
//		if(box.getContent() instanceof String s){
//			String str = s;
//		}
//		
//		box.setContent(new Board());
//		if(box.getContent() instanceof Board b){
//			Board board = b;
//		}
		
		/// Box에 제네릭을 사용한 경우 ///
		Box<String> box = new Box<>(); 		
		// 참고로 왼쪽 <> 안의 타입이 생략된 이유는 
		// 이미 왼쪽에서 결정했기 때문에 저곳에 집어넣으면 알아서 타입이 결정되기 때문이다.
		box.setContent("상품1");
		
		String str = box.getContent();
		Box<Board> box2 = new Box<>();
		
		Board b = box2.getContent();
		
		//이건 Object로 취급
		Box box3 = new Box();
		box3.setContent(new Board());
		
		Board b2 = (Board)box3.getContent();
	}

}
