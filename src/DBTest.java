
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

//		JDBC 
//		1. 드라이버 찾기 - 찾은 드라이버는 
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		2. DBMS에 연결
		String url = "jdbc:mysql://localhost:3306/t1?serverTimezone=UTC";
		String id = "sbsst"; // root
		String pw = "sbs123414"; // 공백
		
		Connection conn = DriverManager.getConnection(url, id, pw); // 연결
		
//		3. sql 문을 실행
//		3.1 실행할 sql문
		String sql = "SELECT * FROM article";
		
//		3.2 작성된 sql문을 DBMS에 전달.
//		Connection - 팀장, Statement - 실무자
//		sql처리 실무자 파견
		
		Statement stmt = conn.createStatement();
		
//		3.3 DBMS에서 가져온 데이터를  ResultSet으로 담아옴
//		ResultSet 조회 결과물(데이터)을 담는 상자
//		stmt.executeQuery(sql); // 조회 결과가 있는 경우 => select 문
//		stmt.executeUpdate(sql); // 조회 결과가 없이 DB에만 반영만 하는 경우 =>insert, update, delete
		
		ResultSet rs =stmt.executeQuery(sql);
	
		while(rs.next()) { 

			String title = rs.getString("title");
			String body = rs.getString("body");
				
			System.out.println(title); 
			System.out.println(body); 
				
		}
		
		if(rs != null) {
			rs.close();
		}
		if(stmt != null) {
			stmt.close();
		}
		if(conn != null) {
			conn.close();			
		}
		
	}

}
