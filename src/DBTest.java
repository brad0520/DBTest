import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

//		JDBC 
//		1. ����̹� ã�� - ã�� ����̹��� 
		Class.forName("com.mysql.cj. jdbc.Driver");
		
//		2. DBMS�� ����
		String url = "jdbc:mysql://localhost:3306/t1?serverTimezone=UTC";
		String id = "sbsst"; // root
		String pw = "sbs123414"; // ����
		
		Connection conn = DriverManager.getConnection(url, id, pw); // ����
		
//		3. sql ���� ����
//		3.1 ������ sql��
		String sql = "SELECT * FROM article";
		
	}

}
