package ex0212.final_abstract;

//Error 를 수정하고 이유를 주석으로 처리하세요.

final class FinalClassExam{ //상속 불가, 생성 가능
 final int i = -999999; // 반드시 초기화, 값 변경 불가
}


abstract class AbstractClassExam{ //상속 가능, 생성 불가
    abstract String abstractMethodExam(int i,String s);  //재정의용 메소드
    final int finalMethodExam(int i, int j){ // 재정의 불가
        return i+j;
    }
}


class Sample01 extends AbstractClassExam{
	String abstractMethodExam(int i,String s){
		System.out.println("return "+s+i);
		return s+i;
	}
	
	// final이라 재정의가 불가능하다.
//	int finalMethodExam(int i, int j){
//		return i*j;
//	}
	
}

// final 클래스는 상속이 불가능하다.
//class Sample02 extends FinalClassExam{  }


 
 class Sample03 extends AbstractClassExam{
	// 이미 구현했기 때문에 다시 abstract로 선언하면 오류 발생
	 String abstractMethodExam(int i,String s){
		return s+i;
	 }
	// abstract 메서드는 abstract 클래스에서만 선언할 수 있다.
//	abstract String abstractMethodExam(int i,String s);    

	void sampleMethod03(){
		System.out.println("void sampleMethod03() 호출 됨");
	}
}

class AbstractFinalClassTest{
    public static void main(String args[]){
    	// 추상화 클래스는 생성이 불가능하다.
//		AbstractClassExam ace = new AbstractClassExam(); 
		FinalClassExam fce = new FinalClassExam();
		// final 값은 변경 불가능하다.
//		fce.i=100000;
		Sample01 s01 = new Sample01();
		AbstractClassExam aceS01 = new Sample01();
		aceS01.abstractMethodExam(700,"_999");
	}
}
