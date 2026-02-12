package ex0211_송정현.sample02;

public abstract class Employee {
	// 필드 선언 ====================
		private int 		empNo;
		private String 	eName;
		private String	job;
		private int			mgr;
		private String	hiredate;
		private String	deptName;
		// ======================/
		
		// Constructor ===================
		public Employee() {
			
		}
		public Employee(int empNo, String eName, String job, int mgr, String hiredate, String deptName) {
			this.empNo      = empNo;
			this.eName       = eName;
			this.job				= job;
			this.mgr	        = mgr;
			this.hiredate 	= hiredate;
			this.deptName  = deptName;
		}
		// ==========================/
		
		// GETTER ======================
			public int getEmpNo() {
				return empNo;
			}
			public String geteName() {
				return eName;
			}
			public String getJob() {
				return job;
			}
			public int getMgr() {
				return mgr;
			}
			public String getHiredate() {
				return hiredate;
			}
			public String getDeptName() {
				return deptName;
			}
			// ==========================/
			
			// SETTER ======================
			public void setEmpNo(int empNo) {
				this.empNo = empNo;
			}
			public void seteName(String eName) {
				this.eName = eName;
			}
			public void setJob(String job) {
				this.job = job;
			}
			public void setMgr(int mgr) {
				this.mgr = mgr;
			}
			public void setHiredate(String hiredate) {
				this.hiredate = hiredate;
			}
			public void setDeptName(String deptName) {
				this.deptName = deptName;
			}
			// ==========================/
			
			// METHOD ========================
			public abstract void message();
			
			@Override
			public String toString() {
			    StringBuilder sb = new StringBuilder();

			    sb.append(" ")
			      .append(empNo).append(" | ")
			      .append(eName).append(" | ")
			      .append(job).append(" | ")
			      .append(mgr).append(" | ")
			      .append(hiredate).append(" | ")
			      .append(deptName);

			    return sb.toString();
			}

			// =============================/
}
