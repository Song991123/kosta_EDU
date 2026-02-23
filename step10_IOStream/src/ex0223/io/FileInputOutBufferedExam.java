package ex0223.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutBufferedExam{

	public FileInputOutBufferedExam(){ //IO는 반드시 사용 후 close() 해야한다.
		FileInputStream 			fis  = null;
		FileOutputStream 		 	fos = null;

		BufferedInputStream 	bis  = null;
		BufferedOutputStream bos = null;
		// ================ fileInputStream
		try {
			// byte 단위 읽기 ( InputStream -> FileInputStream)
			fis = new FileInputStream("src/ex0223text.txt");
			bis = new BufferedInputStream(fis); // inputStream을 매개변수로 받음. 

			//////////////////// byte 배열의 크기만큼 읽기 /////////////
			int len = fis.available(); // 읽을 수 있는 byte 수 반환
			//			byte b[] = new byte [len]; // 이거는 위험함
			byte b[] = new byte [1024]; // 이렇게 주거나, 임의로 적당히 공간을 줌

			int re = 0; // 이 read가 읽어들인 값은 byte가 들어감

			while((re = bis.read(b)) != -1) {
				System.out.println("re = " + re); 
				//				System.out.println("b = " + b); // 이건 주소값. 중요하지 않음.

				// byte 배열 - String으로 변환
				String data = new String(b);
				System.out.println("data = " + data);
			}
			/////////////////////// 파일에 저장 = 출력
			bos = new BufferedOutputStream(new FileOutputStream("src/ex0223/write.txt", true)); // 없으면 만들고, 있으면 덮어쓴다. 뒤의 boolean형은 이어쓰기 할건지 여부
			
			bos.write(65);
			bos.write(66);

			bos.write(13);
			bos.write(75);

			bos.write(75);

			String str = "배고픔";
			// String -> byte 배열로 변환
			bos.write(str.getBytes());


		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// ------------ close
			try {
				// 닫기(버퍼를 먼저 닫아야한다)
				if(bis != null) 	bis.close();
				if(bos != null)	bos.close();
				if(fis != null) 	fis.close();
				if(fos != null) 	fos.close();

				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			// ------------/
		}
		// ===============/

	}

	public static void main(String[] args) {
		new FileInputOutBufferedExam();



	}

}
