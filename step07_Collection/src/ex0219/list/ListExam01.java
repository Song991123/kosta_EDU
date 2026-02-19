package ex0219.list;

import java.util.ArrayList;
import java.util.Collections;

public class ListExam01 extends ArrayList<Integer>{
	
	public ListExam01() {
		super(6);
		
		// 추가
		add(10);
		add(5);
		add(8);
		add(20);
		add(3);
		add(7);
		
		//list에 저장된 객체 개수 출력
		System.out.println("저장된 개수 = " + size());
		
		// 저장된 정보 출력
		for(int no : this) { // 여기는 super 안된다!
			System.out.println("no = " + no);
		}
		
		// 제거
		System.out.println("======제거======");
		int i = remove(1);
		System.out.println("제거 : " + i);
		
		// 저장된 정보 출력
		for(int no : this) { // 여기는 super 안된다!
			System.out.println("no = " + no);
		}
		
		System.out.println("=====정렬하기=====");
		System.out.println("정렬 전 : " + this); // this.toString
		
		Collections.sort(this);
		System.out.println("정렬 후 : " + this); // this.toString
		
		Collections.sort(this, Collections.reverseOrder());;
		System.out.println("정렬 후 : " + this); // this.toString
		
		
	}

	public static void main(String[] args){
		new ListExam01();

	}

}
