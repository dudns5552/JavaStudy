package ex21jdbc.crud;

import java.sql.Types;

import ex21jdbc.callable.DeleteProcCall;

public class DeleteShop extends MyConnection
{

		public DeleteShop() {
		super("education", "1234");
	}
	
	@Override
	public void dbExecute() {
		try {
			//프로시저 호출
			csmt = con.prepareCall("{call ShopDeleteGoods(?,?)}");
			//인파라미터 설정 : 아이디 입력 
			csmt.setString(1, inputValue("삭제할 상품명"));
			//아웃파라미터 설정 : 반환값의 타입에 대한 설정 
			csmt.registerOutParameter(2, Types.VARCHAR);
			//실행 
			csmt.execute();
			System.out.println("삭제프로시저 실행결과:");
			System.out.println(csmt.getString(2));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			dbClose();
		}	
	}
	
	 
	public static void main(String[] args) {	
		new DeleteShop().dbExecute();
	}
}
