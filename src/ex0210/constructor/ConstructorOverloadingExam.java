package ex0210.constructor;
class Puppy3{
	/*String 타입 전역 변수 선언
	  int 타입 전역 변수 선언*/
		String puppyName;
		int	  puppyNo;
	
	/*인수가 없는 생성자작성
		String 타입 전역변수에 "메리" 할당
		"public Puppy3()호출되었습니다"출력
		전역변수 출력
	*/		
		public Puppy3() {
			this.puppyName = "메리";
			System.out.println("public Puppy3()호출되었습니다");
			System.out.println(puppyName);
			System.out.println(puppyNo);
		}
	
	
	/*String 타입의 인수 1개를 받는 생성자작성
		String 타입 전역변수에 인수 할당
		"public Puppy3()호출되었습니다"출력
		전역변수 출력
	*/		
		public Puppy3(String puppyName) {
			this.puppyName = puppyName;
			System.out.println("public Puppy3()호출되었습니다");
			System.out.println(puppyName);
			System.out.println(puppyNo);
		}
		
	
	/*String 타입의 인수 2개를 받는 생성자작성
		인수2개를 하나의 String으로 만들어
		String 타입의 인수 1개를 받는 생성자에게 인수로 주며 호출
		"public Puppy3()호출되었습니다"출력
	*/		
		public Puppy3(String puppyName, String puppyName2) {
			this(puppyName + puppyName2);
			System.out.println("public Puppy3()호출되었습니다");
		}
	
	/*boolean 타입의 인수 1개를 받는 생성자작성
		인수를 "쫑"과 붙여 하나의 String으로 만들어
		String 타입의 인수 1개를 받는 생성자에게 인수로 주며 호출
		"public Puppy3()호출되었습니다"  출력
	*/					
		public Puppy3(boolean isJJong) {
			this(isJJong + "쫑");
			System.out.println("public Puppy3()호출되었습니다");
		}
	
	
	/*char 타입의 인수 1개를 받는 생성자작성
			인수가 없는 생성자를 호출하고
			인수로 받은 data를 int타입 전역변수에 할당	
			"puplic Puppy3()호출되었습니다"출력
			int형 전역변수출력
	*/			
		public Puppy3(char puppyNo) {
			this();
			this.puppyNo = puppyNo;
			System.out.println("public Puppy3()호출되었습니다");
			System.out.println(puppyNo);
		}
	
	
	/*메소드 printMemberVariable
	리턴 없슴
	전역변수를 출력
	*/	
	public void printMemberVariable() {
		System.out.println(puppyName);
		System.out.println(puppyNo);
	}
}

public class ConstructorOverloadingExam{
		//메인메소드에서
		public static void main(String [] args){
			//Puppy3 클래스의 각 생성자를 한번씩 이용해 객체 5개 생성
			// 아무것도 없는 생성자
			Puppy3 puppy3_1 = new Puppy3();
			// String 하나만 받는 생성자
			Puppy3 puppy3_2 = new Puppy3("마야");
			// String 두개 받는 생성자
			Puppy3 puppy3_3 = new Puppy3("마야", "해피");
			// boolean타입 받는 생성자
			Puppy3 puppy3_4 = new Puppy3(true);
			// char타입 받는 생성자
			Puppy3 puppy3_5 = new Puppy3('A');
			
		//각 객체의 printMemberVariable메소드를 한번씩 호출
			puppy3_1.printMemberVariable();
			puppy3_2.printMemberVariable();
			puppy3_3.printMemberVariable();
			puppy3_4.printMemberVariable();
			puppy3_5.printMemberVariable();
			
	}
}