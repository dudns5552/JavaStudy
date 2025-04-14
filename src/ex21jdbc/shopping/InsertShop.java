package ex21jdbc.shopping;

import java.sql.SQLException;

import ex21jdbc.crud.MyConnection;

public class InsertShop extends MyConnection{

	public InsertShop() {
		super("education", "1234");
	}
	
	String query;
	int result;
	
	@Override
	public void dbExecute() {
		try {
			query = "INSERT INTO sh_goods VALUES "
					+ " (seq_total_idx.nextval, ?, ?, sysdate, ?)";
			psmt = con.prepareStatement(query);
			psmt.setString(1, inputValue("상품명"));
			psmt.setString(2, inputValue("상품가격"));
			psmt.setString(3, inputValue("상품코드"));
			result = psmt.executeUpdate();
			System.out.println("[psmt]" + result + "행 입력됨");
		}
		catch (SQLException e) {
			System.out.println("쿼리실행 중 예외발생");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new InsertShop().dbExecute();
	}
}
