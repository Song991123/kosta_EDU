package ex0309.db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import ex0309.db.util.DbManager;
import ex0309.dto.Emp;

public class EmpDAO {
	/**
	 * 사원의 이름 검색하기
	 * */
	public void getSelectNames() {
		Connection con = null;
		Statement   st 	 = null;
		ResultSet     rs   = null;
		try {
			// 로드 연결 실행 닫기
			con = DbManager.getConnection();
			
			st = con.createStatement();
			rs = st.executeQuery("select ename from emp");
			
			while(rs.next()) {
				// 열을 조회
				String ename = rs.getString("ename");
				System.out.println(ename);
			}
			System.out.println("****조회완료****");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbManager.dbClose(con, st, rs);
		}
	}
	// 사원 등록
	public void insert(Emp emp) {
		Connection con = null;
		Statement   st   = null;
		String 		   sql = "insert into emp(empno, ename, sal, hiredate) values("+ emp.getEmpno() +",'"+ emp.getEname() + "'," + emp.getSal() + ", now())";
		try {
			con = DbManager.getConnection();
			st = con.createStatement();
			int re  = st.executeUpdate(sql);
			System.out.println("re = " + re);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			DbManager.dbClose(con, st);
		}
	}
	
	/**
	 * PreparedStatement 방식으로 insert 하기 
	 * */
	public void preParedInsert(Emp emp) {
		Connection con = null;
		PreparedStatement   ps   = null;
		String 		   sql = "insert into emp(empno, ename, sal, hiredate) values(?, ?, ?, now())"; // 틀만 만들어둠.
		try {
			con = DbManager.getConnection();
			ps = con.prepareStatement(sql); // prepare니까 준비해야함. 그래서 여기에 sql을 넣어준다.
			// ?에 순서대로 개수만큼 setXxx(?의 순서, 값) 하기
			ps.setInt(1, emp.getEmpno());
			ps.setString(2, emp.getEname());
			ps.setInt(3, emp.getSal());
			
			int re  = ps.executeUpdate();
			System.out.println("re = " + re);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			DbManager.dbClose(con, ps);
		}
	}
} // 클래스 끝
