package ex0212.equals;

class EqualsExam2{
	String stringObject;
	
	public EqualsExam2(String s){
		stringObject = s;
	}
	
	
	public String getStringObject() {
		return stringObject;
	}


	public void setStringObject(String stringObject) {
		this.stringObject = stringObject;
	}

	/**
	 * Object의 equals를 문자열 비교하는 걸로 변경
	 * */
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof EqualsExam2) {
			EqualsExam2 ee = (EqualsExam2)obj;
			if(getStringObject().equals(ee.getStringObject())) return true;
		}
		else {
			return false;
		}
		return super.equals(obj);
	}


	public static void main(String args[]){		
		System.out.println("\nEqualsExam ee1 = new EqualsExam(\"Object.equals()\");" );
		System.out.println("\nEqualsExam ee2 = new EqualsExam(\"Object.equals()\");" );
				
		EqualsExam2 ee1 = new EqualsExam2("Object.equals()");
		EqualsExam2 ee2 = new EqualsExam2("Object.equals()");
		
		if(ee1.equals(ee2)){ // Object에 정의된 equals, 즉 주소값을 비교한다.
			System.out.println("ee1.equals(ee2) = true"); 
		}else{
			System.out.println("ee1.equals(ee2) = false"); // 정답
		}
		
		if(ee1 == ee2){ // 주소값을 비교한다.
			System.out.println("(ee1 == ee2) = true"); 
		}else{
			System.out.println("(ee1 == ee2) = false");  // 정답
		}
		
		System.out.println("\nString s1 = \"new String Object1\";");
		System.out.println("\nString s2 = \"new String Object1\";");
		
		String s1 = "new String Object1";
		String s2 = "new String Object1";
		
		if(s1.equals(s2)){ // String에 정의된 equals, 즉 내용을 비교한다.
			System.out.println("s1.equals(s2) = true");  // 정답
		}else{
			System.out.println("s1.equals(s2) = false");
		}
		
		if(s1==s2){ // 주소값을 비교한다.
			System.out.println("(s1==s2) = true");  // 정답
		}else{
			System.out.println("(s1==s2) = false");
		}

		System.out.println("\nString s3 = new String(\"new String Object2\");");
		System.out.println("\nString s4 = new String(\"new String Object2\");");
 
 		String s3 = new String("new String Object2");
		String s4 = new String("new String Object2");
		
		if(s3.equals(s4)){ // String에 정의된 equals, 즉 내용을 비교한다.
			System.out.println("s3.equals(s4) = true");  // 정답
		}else{
			System.out.println("s3.equals(s4) = false");
		}
		
		if(s3==s4){	// 주소값을 비교한다.
			System.out.println("(s3==s4) = true");  // 정답
		}else{
			System.out.println("(s3==s4) = false");
		}

		System.out.println("\nString s5 = new String(\"new String Object3\");");
		System.out.println("\nString s6 = \"new String Object3\";");
		System.out.println("\nString s7 = \"new String Object3\";");
 
 		String s5 = new String("new String Object3");
		String s6 = "new String Object3";
		String s7 = "new String Object3";
		
		if(s5.equals(s6)){ // String에 정의된 equals, 즉 내용을 비교한다.
			System.out.println("s5.equals(s6) = true");  // 정답
		}else{
			System.out.println("s5.equals(s6) = false");
		}
		
		if(s5==s6){ // 주소값을 비교한다.
			System.out.println("(s5==s6) = true");
		}else{
			System.out.println("(s5==s6) = false");  // 정답
		}

			
		if(s6.equals(s7)){ // String에 정의된 equals, 즉 내용을 비교한다.
			System.out.println("s6.equals(s7) = true");  // 정답
		}else{
			System.out.println("s6.equals(s7) = false");
		}
		
		if(s6==s7){ // 주소값을 비교한다.
			System.out.println("(s6==s7) = true");  // 정답
		}else{
			System.out.println("(s6==s7) = false");
		}
	}
}
