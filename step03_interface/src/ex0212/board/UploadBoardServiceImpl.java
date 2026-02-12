package ex0212.board;

public class UploadBoardServiceImpl implements BoardService {

	@Override
	public int insert(Board board) {
		System.out.println("upload = " + board);
		System.out.println(super.getClass().getSimpleName() + "insert call");
		return 0;
	}

	@Override
	public boolean update(Board board) {
		System.out.println("upload = " + board);
		System.out.println(super.getClass().getSimpleName() + "update call");
		return false;
	}

	@Override
	public Board selectByNo(int no) {
		// TODO Auto-generated method stub
		return null;
	}

}
