package mvc.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;

import mvc.dto.Electronics;
import mvc.exception.DuplicateModelNoException;
import mvc.exception.ElectronicsArrayBoundsException;
import mvc.exception.SearchNotFoundException;

/**
 * 전자제품에 관련된 기능을 담당할 클래스
 */

public class ElectronicsServiceImpl implements ElectronicsService {

	private static ElectronicsService instance = new ElectronicsServiceImpl(); 
	private static final int MAX_SIZE=10;
	List<Electronics> list = new ArrayList<Electronics>();


	/** 
	 * 외부에서 객체 생성안됨. 
	 * InitInfo.properties파일을 로딩하여  List에 추가하여
	 * 초기치 데이터를 만든다.
	 * 이 부분은 Spring을 사용 시, framework가 알아서 설정해준다.
	 */
	private ElectronicsServiceImpl() {
		System.out.println("**private constructor init.....");
		ResourceBundle rb = ResourceBundle.getBundle("InitInfo");//InitInfo.properties
		for(String key : rb.keySet()) {
			String value =  rb.getString(key); //100,\uC120\uD48D\uAE30,35000,\uC0BC\uC131 \uC120\uD48D\uAE30
			String data[] = value.split(",");
			//System.out.println(key +" = " + value);

			list.add(new Electronics( 
					Integer.parseInt(data[0]) ,data[1], 
					Integer.parseInt( data[2]), data[3]) );

		}

		System.out.println(list);

	}

	public static ElectronicsService getInstance() {
		return instance;
	}

	@Override
	public void insert(Electronics electronics) 
			throws ElectronicsArrayBoundsException, DuplicateModelNoException {

		if( list.size() >= MAX_SIZE ) 	throw new ElectronicsArrayBoundsException("배열의 길이를 벗어나 더이상 등록 할수 없습니다.");
		
		try {
			this.searchByModelNo(electronics.getModelNo());
			throw new DuplicateModelNoException("중복된 모델 번호입니다."); 
		}catch (SearchNotFoundException e) {
			list.add(electronics);
		}
		
//		if(list.contains(electronics))  throw new DuplicateModelNoException("중복된 모델 번호입니다."); 
//		list.add(electronics);
	}

	@Override
	public List<Electronics> selectAll() {
		return list;
	}

	@Override
	public Electronics searchByModelNo(int modelNo) throws SearchNotFoundException {
		Electronics findElectronics = null;

		for(Electronics electronics : list) {
			if(electronics.getModelNo() == modelNo) 	findElectronics = electronics;
		}

		if(findElectronics == null) throw new SearchNotFoundException(modelNo + "는 없는 모델번호로 검색할수 없습니다.");
		return findElectronics;
	}

	@Override
	public void update(Electronics electronics) throws SearchNotFoundException {
		searchByModelNo(electronics.getModelNo()).setModelDetail(electronics.getModelDetail());

	}

	@Override
	public void delete(int modelNo) throws SearchNotFoundException {

		Electronics findElectronics = searchByModelNo(modelNo);
		list.remove(findElectronics);
		
	}

	@Override
	public List<Electronics> selectSortByPrice() {
		List<Electronics> copyList = new ArrayList<>(list);
		Collections.sort(copyList);
//		Collections.sort(copyList , (a,b)-> 
//				a.getModelPrice() == b.getModelPrice() ? b.getModelNo()-a.getModelNo() : a.getModelPrice()-b.getModelPrice());
		
		return copyList;
	}

} // 클래스 끝 