package ex0212_송정현;

public class Audio extends Elec implements ElecFunction {
	// 필드 선언 ====================
	private int volume;
	// ======================/
	
	// Constructor ===================
	public Audio() {
	}
	public Audio(int volume) {
		this.volume = volume;
	}
	public Audio(String code, int cost, int volume) {
		super(code, cost);
		this.volume = volume;
	}
	// ==========================/
	
	// METHOD ========================
	@Override
	public void start() {
		
	}


	@Override
	public void stop() {
		
	}

	@Override
	public void display() {
		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.getCode());
		builder.append("의 Audio를 ");
		builder.append(volume);
		builder.append("으로 듣는다.");
		
		return builder.toString();
	}
	// =============================/
}
