package ex0212_송정현;
/**
 * 작성일 : 260212
 * 작성자 : 송정현
 * 과제 목표 : 실습 폴더에 클래스다이어그램,  MainApp,  출력결과 보고 코드를 완성한다.
 * */
public class MainApp {

	public static void main(String[] args) {
		// Tv 2대 , Audio 2대 저장하고 그 정보를 출력한다.
		ElecFunction elec[] = new ElecFunction[5];

		elec[0] = new Tv("A01", 500000, 12);
		elec[1] = new Tv("A02", 2500, 20);
		elec[2] = new Tv("A03", 3000, 30);

		elec[3] = new Audio("A04", 8500, 200);
		elec[4] = new Audio("A05", 700, 100);

		for (ElecFunction e : elec) {
			 e.start();
//			System.out.println(e);
		}

	}
}
