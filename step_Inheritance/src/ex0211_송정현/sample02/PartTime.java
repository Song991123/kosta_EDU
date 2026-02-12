package ex0211_송정현.sample02;

public class PartTime extends Employee {
	// 필드 선언 ====================
			private int			timePay;
			// ==========================/
			
			// Constructor ===================
				public PartTime() {
					
				}
				public PartTime(int empNo, String eName, String job, int mgr, String hiredate, String deptName, int timePay) {
					super(empNo, eName, job, mgr, hiredate, deptName);
					setTimePay(timePay);
				}
				// GETTER ======================
				public int getTimePay() {
					return timePay;
				}
				
				// ==========================/
				
				
				// SETTER ======================
				public void setTimePay(int timePay) {
					this.timePay = timePay;
				}
				// ==========================/
				
				// METHOD ========================
				public void message() {
					System.out.println(geteName() + "은 비정규직입니다.");
				}
				
				@Override
				public String toString() {
				    StringBuilder sb = new StringBuilder();

				    sb.append(super.toString())
				      .append(getTimePay());

				    return sb.toString();
				}
}
