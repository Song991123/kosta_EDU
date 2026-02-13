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
		StringBuilder builder = new StringBuilder();
		builder.append(super.getCode());
		builder.append("의 Audio를 ");
		builder.append(volume);
		builder.append("으로 듣는다.");
		System.out.println(builder);
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
		builder.append("Audio [volume=");
		builder.append(volume);
		builder.append(", getCode()=");
		builder.append(getCode());
		builder.append(", getCost()=");
		builder.append(getCost());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append("]");
		return builder.toString();
	}
	

	// =============================/
}
