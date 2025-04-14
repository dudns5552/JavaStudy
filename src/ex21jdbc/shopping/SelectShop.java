package ex21jdbc.shopping;




import java.sql.SQLException;

import ex21jdbc.crud.MyConnection;

/*
상품조회
Statement객체를 사용하여 작성한다.
클래스명 : ex21jdbc.shopping.SelectShop
검색할 상품명을 입력받은 후 like를 통해 해당조건에 맞는 레코드만 출력한다. 
출력항목 : 일련번호, 상품명, 가격, 등록일, 제품코드
단, 등록일은 0000-00-00 00:00 형태로 출력해야 한다.	상품가격은 세자리마다 
컴마를 찍어준다.
Statement객체는 인파라미터를 통한 동적쿼리를 
작성할 수 없으므로 순수 Java변수를 사용한다.
*/
public class SelectShop extends MyConnection{

	public SelectShop(String user, String pass) {
		super(user, pass);
	}
	
	String query;
	int result;

	
	@Override
		public void dbExecute() {
		try {
			stmt = con.createStatement();
			
			String Thing = inputValue("상품명");
			query = "SELECT g_idx, goods_name, "
					+ "to_char(goods_price, '999,990'), "
					+ " to_char(regidate, 'yyyy.mm.dd hh24:mi') d1 , p_code "
					+ " FROM sh_goods where goods_name like '%'||'" + Thing + "'||'%'";
			rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				String g_idx = rs.getString(1);
				String g_name = rs.getString(2);
				String g_price = rs.getString(3);
				String regidate = rs.getString("d1");
				String p_code = rs.getString(5);
				
				System.out.printf("%s %s %s %s %s \n", g_idx, g_name, g_price,
						 regidate, p_code);
			}
		}
		catch (SQLException e) {
			System.out.println("쿼리실행 중 예외발생");
			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("알수없는 예외발생");
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		new SelectShop("education", "1234").dbExecute();
	}
}
