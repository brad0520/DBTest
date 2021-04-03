import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

//		JDBC 
//		1. 드라이버 찾기 - 찾은 드라이버는 
		Class.forName("com.mysql.cj. jdbc.Driver");
		
//		2. DBMS에 연결
		String url = "jdbc:mysql://localhost:3306/t1?serverTimezone=UTC";
		String id = "sbsst"; // root
		String pw = "sbs123414"; // 공백
		
		Connection conn = DriverManager.getConnection(url, id, pw); // 연결
		
//		3. sql 문을 실행
//		3.1 실행할 sql문
		String sql = "SELECT * FROM article";
		
	}

}
