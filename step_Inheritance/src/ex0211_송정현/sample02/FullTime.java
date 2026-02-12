package ex0211_송정현.sample02;

public class FullTime extends Employee {
	// 필드 선언 ====================
		private int			salary;
		private int			bonus;
		// ======================/
		
		
		// Constructor ===================
		public FullTime() {
			
		}
		public FullTime(int empNo, String eName, String job, int mgr, String hiredate, String deptName, int salary, int bonus) {
			super(empNo, eName, job, mgr, hiredate, deptName);
			setSalary(salary);
			setBonus(bonus);
		}
		// ==========================/
		
		// GETTER ======================
		public int getSalary() {
			return salary;
		}
		public int getBonus() {
			return bonus;
		}
		// ==========================/
		
		// SETTER ======================
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public void setBonus(int bonus) {
			this.bonus = bonus;
		}
		// ==========================/
		
		// METHOD ========================
		public void message() {
			System.out.println(geteName() + "은 정규직입니다.");
		}
		
		@Override
		public String toString() {
		    StringBuilder sb = new StringBuilder();

		    sb.append(super.toString())
		      .append(getSalary()).append(" | ")
		      .append(getBonus())
		      .append(" ");

		    return sb.toString();
		}

}
