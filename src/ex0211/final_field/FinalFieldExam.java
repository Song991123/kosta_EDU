package ex0211.final_field;

public class FinalFieldExam {
	int i ; // 인스턴스 필드
	final int j = 10; // 인스턴스 필드
	static final int K = 20; // static 필드
	
	
	public static void main(String[] args) {
		//static 필드 접근
		System.out.println(FinalFieldExam.K);
		
		
		// 인스턴스 필드 접근
		FinalFieldExam fe = new FinalFieldExam();
		
		System.out.println(fe.i);
		System.out.println(fe.j);

	}

}
