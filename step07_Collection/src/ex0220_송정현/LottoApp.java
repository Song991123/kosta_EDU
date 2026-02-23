package ex0220_송정현;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;


/**
 * 작성자 : 송정현
 * 작성일 : 2026-02-22
 * 목적 : 로또 번호 6개를 리스트에 만들어서 내림차순으로 출력한다.(1 ~ 45)
 * */
public class LottoApp {
	public static void main(String[] args) {
		LottoService ls = new LottoService();
		
		ls.printlottoNumberList();
	}

}

class LottoService{
    /**
     * 로또 번호 6개를 생성하는 메서드<br>
     * - 1 ~ 45 사이의 랜덤 숫자를 생성 <br>
     * - 중복 제거 <br>
     * - 최종적으로 내림차순 정렬하여 반환 <br>
     *
     * @return 생성된 로또 번호 리스트
     */
	public Set<Integer> lottoNumberListGenerator() {
		Set<Integer> lottoNumberList = new TreeSet<>(Collections.reverseOrder());
		
		while(lottoNumberList.size() < 6) {
			int randomNumber = (int)(Math.random()*45) + 1;
			lottoNumberList.add(randomNumber);
		}
		
		return lottoNumberList;
	}
	
    /**
     * 생성된 로또 번호를 출력하는 메서드
     */
	public void printlottoNumberList() {
		
		System.out.println("오늘의 로또 번호 = " + lottoNumberListGenerator());
	}
	
}