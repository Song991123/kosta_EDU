package ex0219.list;

/**
 * 사원정보
 * */
//public class Emp implements Comparable<Emp>
public class Emp {
	private int empNo;
	private String name;
	private int age;
	private String addr;
	
	public Emp() {
	}
	public Emp(int empNo, String name, int age, String addr) {
		this.empNo = empNo;
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Emp [empNo=");
		builder.append(empNo);
		builder.append(", name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append(", addr=");
		builder.append(addr);
		builder.append("]");
		return builder.toString();
	}
	
//	// 앞 - 뒤
//	// 0이면 같음
//	// 음수면 앞(this)이 더 작으므로 왼쪽 유지
//	// 양수면 앞(this)이 더 크므로 뒤(o)가 왼쪽으로 감
//	@Override
//	public int compareTo(Emp o) {
//		return Integer.compare(this.empNo, o.getEmpNo());
//	}
	
}
