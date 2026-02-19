package ex0219.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListExam02{
	// 생성은 구현 객체로 하나, 접근은 반드시 인터페이스로 해야 한다.
	// 때문에 리스트로 접근하는 것
//	List<Integer> list = new ArrayList<>(5);	
	List<Integer> list = new LinkedList<>(); // LinkedList는 배열 기반이 아니라 공간이 정해져 있지가 않다.
//	List<Integer> list = new Vector<>(5);
	
	public ListExam02() {
		
		// 추가
		list.add(10);
		list.add(5);
		list.add(8);
		list.add(20);
		list.add(3);
		list.add(7);
		
		//list에 저장된 객체 개수 출력
		System.out.println("저장된 개수 = " + list.size());
		
		// 저장된 정보 출력
		for(int no : list) { // 여기는 super 안된다!
			System.out.println("no = " + no);
		}
		
		// 제거
		System.out.println("======제거======");
		int i = list.remove(1);
		System.out.println("제거 : " + i);
		
		// 저장된 정보 출력
		for(int no : list) { // 여기는 super 안된다!
			System.out.println("no = " + no);
		}
		
		System.out.println("=====정렬하기=====");
		System.out.println("정렬 전 : " + list); // list.toString
		
		Collections.sort(list);
		System.out.println("정렬 후 : " + list); // list.toString
		
		Collections.sort(list, Collections.reverseOrder());;
		System.out.println("정렬 후 : " + list); // list.toString
		
		
	}

	public static void main(String[] args){
		new ListExam02();

	}

}
