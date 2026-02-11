package ex0211.final_field;

public class FinalFieldExam {
	int i ; // 인스턴스 필드 0
	
	// final 변수 ------------------------------------
	//final은 고정값으로 값변경 불가
	// final필드는 반드시 명시적 초기화.
	// 어쨌든 이것도 인스턴스 필드이므로, 객체 생성하는 사용자 객체 생성 시 생성자를 이용해 값 초기화 할 수 있음.
	final int j; // 인스턴스 필드
	// 어떻게 객체를 생성하든, 즉 누가 사용하든 항상 동일한 값이다.
	static final int K; // static 필드
	
	// static 필드는 static 블럭에서 값 초기화 가능
	static {
		K=100;
	}
	
	public FinalFieldExam(){
		this.j = 10;
	}
	public FinalFieldExam(int j){
		this.j = j;
	}
	

	
	public static void main(String[] args) {
		//static 필드 접근
		System.out.println(FinalFieldExam.K);
		
		
		// 인스턴스 필드 접근
		FinalFieldExam fe = new FinalFieldExam();
		
		System.out.println(fe.i);
		System.out.println(fe.j);
		
		FinalFieldExam fe2 = new FinalFieldExam(200);
		System.out.println(fe2.i);
		System.out.println(fe2.j);

	}

}
