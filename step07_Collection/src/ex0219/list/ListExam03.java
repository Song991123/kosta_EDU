package ex0219.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListExam03 extends ArrayList<Emp>{
	
	// 초기치 사원정보 5명 추가
	public ListExam03() {
		//저장하기
		add(new Emp(20, "하나", 21, "서울"));
		add(new Emp(10, "둘", 32, "광주"));
		add(new Emp(30, "셋", 13, "경기도"));
		add(new Emp(15, "넷", 44, "경기도"));
		add(new Emp(7, "다섯", 21, "서울"));
	}
	
	/**
	 * 저장된 모든 사원정보 리턴
	 * */
	public List<Emp> selectAll() {
		return this;
	}
	
	/**
	 * 사원번호에 해당하는 사원정보 리턴
	 * */
	public Emp selectByEmpNo(int empNo) {
		for(Emp emp : this) {
			if(empNo == emp.getEmpNo()) return emp;
		}
		return null;
	}
	
	/**
	 * 주소를 인수로 전달받아 동일한 주소인 모든 사원정보 리턴
	 * */
	public List<Emp> selectByEmpAddr(String empAddr){
		List<Emp> list = new ArrayList<>();
		for(Emp emp : this) {
			if(empAddr.equals(emp.getAddr())) list.add(emp);
		}
		return list;
	}
	
	/**
	 * 사원번호를 기준으로 정렬한 정보 리턴
	 * */
	public List<Emp> sortByEmpNo(){
		// 기존 정보를 건드는 경우는 별로 없다. 
		//원본은 남겨두고, 정렬된 값 기준으로 보여주기로 한다.
		List<Emp> copyList = new ArrayList<Emp>(this);
//		Collections.sort(copyList);
		copyList.sort(Comparator.comparing(Emp::getEmpNo));
		return copyList;
	}
	

	/**
	 * 나이를 기준으로 정렬한 정보를 리턴
	 * */
	public List<Emp> sortByEmpAge(){
		List<Emp> copyList = new ArrayList<Emp>(this);
		// 1. 외부에서 기준 세운 걸 불러와 활용
//		Collections.sort(copyList, new Test());
		// 2. 익명 내부 클래스
//		Collections.sort(copyList, new Comparator<Emp>() {
//			@Override
//			public int compare(Emp o1, Emp o2) {
//				return o1.getAge() - o2.getAge();
//			}
//			
//		});
		// 3. 람다식
		Collections.sort(copyList, (e1, e2) -> e1.getAge() - e2.getAge()); // 람다식이 자동 추론으로 Emp로 인식
		
		// 4. 메서드 참조 + Comparator.comparing 사용
//		list.sort(Comparator.comparing(Emp::getAge));
		return copyList;
	}
	
	
	public static void main(String[] args) {
		ListExam03 list03 = new ListExam03();
		List<Emp> list 		= null;
		
		System.out.println("========= 저장된 모든 사원 정보 =========");
		// 저장된 모든 사원 정보 리턴
		for(Emp emp : list03.selectAll()) {
			System.out.println(emp);
		}
		System.out.println();
		System.out.println("========= 사원 번호에 해당하는 사원정보 =========");
		System.out.println("입력값 : 20 \n" + list03.selectByEmpNo(20));
		
		System.out.println();
		System.out.println("========= 동일 주소인 모든 사원정보 =========");
		
		list = list03.selectByEmpAddr("경기도");
		if(list.size() ==0) System.out.println("해당하는 주소의 사원이 없습니다.");
		else {
			for(Emp emp : list) {
				System.out.println(emp);
			}
		}
		
		System.out.println();
		System.out.println("========= 사원번호 기준으로 정렬 =========");
		for(Emp emp : list03.sortByEmpNo()) {
			System.out.println(emp);
		}		
		
		System.out.println();
		System.out.println("========= 나이 기준으로 정렬 =========");
		for(Emp emp : list03.sortByEmpAge()) {
			System.out.println(emp);
		}
		
	}

}
///////////////////////////////
///**
// * 외부에서 비교하는 기준 세우기
// * */
//class Test implements Comparator<Emp>{
//
//	@Override
//	public int compare(Emp o1, Emp o2) {
//		return o1.getAge() - o2.getAge();
//	}
//	
//}
