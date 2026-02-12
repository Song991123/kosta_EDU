package ex0212_송정현;

public class Elec {
	// 필드 선언 ====================
	private String code;
	private int		 cost;
	// ======================/
	
	// Constructor ===================
	public Elec() {
	}
	public Elec(String code, int cost) {
		this.code = code;
		this.cost = cost;
	}
	// ==========================/
	
	// GETTER ======================
	public String getCode() {
		return code;
	}
	public int getCost() {
		return cost;
	}
	// ==========================/
	
	// SETTER ======================
	public void setCode(String code) {
		this.code = code;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	// ==========================/
	/**
	 * 의미 없는 오버라이딩같아서 abstract로 할까 했는데
	 * 클래스 다이어그램에 명시되지 않은 것 같아 뺐습니다.
	 * */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Elec [code=");
		builder.append(code);
		builder.append(", cost=");
		builder.append(cost);
		builder.append("]");
		return builder.toString();
	}
	
}
