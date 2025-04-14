package ex21jdbc.crud;

import java.sql.SQLException;
import java.sql.Types;

import ex21jdbc.callable.InsertProcCall;

public class UpdateShop extends MyConnection{

	public UpdateShop() {
		super("education", "1234");
	}

	@Override
	public void dbExecute() {
		try {
			csmt = con.prepareCall("{call ShopUpdateGoods(?,?,?,?,?)}");
			//인파라미터 설정 : 사용자로부터 입력받은 값을 세팅 
			csmt.setString(4, inputValue("수정할 상품의 일련번호"));
			csmt.setString(1, inputValue("바뀔상품이름"));
			csmt.setString(2, inputValue("바뀔가격"));
			csmt.setString(3, inputValue("바뀔상품의 카테고리"));
			//아웃파라미터 설정 : 반환값에 대한 자료형만 설정하면 된다. 
			csmt.registerOutParameter(5, Types.NUMERIC);
			//프로시저 실행
			csmt.execute();
			//out파라미터에 할당된 값을 읽어 결과를 출력한다. 
			int affected = csmt.getInt(5);
			if(affected==0) 
				System.out.println("오류발생:입력실패");
			else 
				System.out.println(affected +"행 입력성공");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			dbClose();
		}
	}
	
	public static void main(String[] args) {
		new UpdateShop().dbExecute();
	}
}
