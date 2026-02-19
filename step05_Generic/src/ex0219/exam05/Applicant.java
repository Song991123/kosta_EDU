package ex0219.exam05;
/**
 * 신청 - 누가 신청을 하느냐
 * */
public class Applicant<T> {
	private T kind; // 사람, 직장인, 학생, 고등, 중등

	// 애초에 Applicant 불러올 때 생성자를 통해 들어갈 타입을 구체적으로 정하게끔 함
	public Applicant(T kind) {
		this.kind = kind;
	}

	public T getKind() {
		return kind;
	}

	public void setKind(T kind) {
		this.kind = kind;
	}
	
	
}
