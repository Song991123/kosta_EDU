package ex0309.view;

import ex0309.db.dao.EmpDAO;
import ex0309.dto.Emp;

public class EmpView {

	public static void main(String[] args) {
		System.out.println("---JDBC 연결---");
		EmpDAO dao = new EmpDAO();
		dao.getSelectNames();
		
		System.out.println("2. ---등록---");
//		dao.insert(new Emp(9001, "미미", 3000, null));
		
		System.out.println("2-2. ---prepared 등록 ---");
		dao.preParedInsert(new Emp(9002, "미미", 3000, null));
		
	}

}
