package ex0213_송정현.chapter11_solution8;
/**
 * 문제 8번 : FileWriter는 파일을 열고 데이터를 저장하는 클래스입니다. 
 * 예외 발생 여부와 상관 없이 마지막에는 close()메소드를 실행해서 파일을 닫아 주려고 합니다.
 * 왼쪽 코드는 try-catch-finally를 이용해서 작성한 코드로, 리소스 자동 닫기를 이용하도록 수정하고 싶습니다.
 * 수정한 코드를 오른쪽에 작성해보세요.
 * */
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) {
		////////// [교체된 빈칸] ////////////
		
		// try-with-resources는 예외 발생 여부와 상관없이 리소스를 자동으로 닫아주므로
		// finally가 필요가 없다.
		try {
			FileWriter fw = new FileWriter("file.txt");
			fw.write("Java");
		}catch(IOException e) { 
			e.printStackTrace();
		}
		//////////////////////////////////

	}

}
