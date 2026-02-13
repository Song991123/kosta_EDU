package ex0213;

public class ExceptionExam {

	public static void main(String[] args) {
		System.out.println(" ********* 메인 시작 *********");
		System.out.println("args = " + args);
		try {
			System.out.println("args [0] = " + args[0]);
			
			int convertNo = Integer.parseInt(args[0]);
			System.out.println("변환 값 = " + convertNo);
			
			int result = 100 / convertNo;
			System.out.println("나눈 결과 = " + result);
		} //catch 블럭을 여러 개 작성 시, 반드시 서브클래스부터 작성
		catch (ArrayIndexOutOfBoundsException e) {
			//예외가 발생했을 떄 해야할 일
			System.out.println("인수를 전달해주시기 바랍니다. " + e); 
					
		   // e자체를 출력하는 경우
		}catch (NumberFormatException e) {
			System.out.println("숫자만 입력해주세요 => " + e.getMessage()); 					// 에러 메세지만 출력하는 경우
		}catch (ArithmeticException e) {
			System.out.println("0 이상의 숫자만 입력해주세요 => " + e.getMessage());
		}catch (Exception e) { 																						// 모든 예외 메세지를 출력하는 경우 
			// 이외의 모든 예외는 여기서 처리한다.
			System.out.println("예외가 발생했습니다.");
			
			// 개발자가 개발할 때 예외의 대한 정보를 추적(디버깅) 할 때 사용한다.
			// 반드시 배포(production 환경)에서는 제거해야함.
			e.printStackTrace(); // 예외정보를 detail하게 stack에서 꺼내 출력해줌.
		}
		finally {
			System.out.println("finally 영역은 예외 상관없이 항상 실행");
		}
		
		System.out.println(" ********* 메인 끝 *********");
	}
}
