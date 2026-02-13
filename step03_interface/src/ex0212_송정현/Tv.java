package ex0212_송정현;

public class Tv extends Elec implements ElecFunction {
	// 필드 선언 ====================
	private int channel;
	
	// ======================/
	
	// Constructor ===================
	public Tv() {
		super();
	}
	public Tv(int channel) {
		super();
		this.channel = channel;
	}
	public Tv(String code, int cost, int channel) {
		super(code, cost);
		this.channel = channel;
	}
	// ==========================/
	
	// METHOD ========================
	@Override
	public void start() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.getCode());
		builder.append("제품 TV를 ");
		builder.append(channel);
		builder.append("로 본다");
		
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
		builder.append("Tv [channel=");
		builder.append(channel);
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
