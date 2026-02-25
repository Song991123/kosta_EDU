package ex0225.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExam {
	public ServerExam() {
		try (ServerSocket server = new ServerSocket(8000)){
			while(true) {
				System.out.println("클라이언트 접속을 대기중입니다.");
				
				Socket sk = server.accept(); // 클라이언트 접속 대기중
				String  ip =sk.getInetAddress().toString();
				System.out.println(ip + "님 접속되었습니다.");
				
				// 클라이언트가 보내온 내용을 먼저 읽기 - 
				BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
				String clientData =  br.readLine(); // 한번에 읽어오기
				System.out.println("클라이언트가 보내온 내용 = " + clientData);
				
				// 클라이언트에게 데이터를 보내기 = 전송
				PrintWriter pw = new PrintWriter(sk.getOutputStream(), true); // 문자단위의 전송. 오토플러쉬를 true로 설정하면 바로바로 flush가 된다. 꼭 true
				pw.println("SJH, Hello World!"); // print만 하면 전송이 안되고, println해야 오토플러쉬가 일어난다.
				
				System.out.println();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new ServerExam();
	}

}
