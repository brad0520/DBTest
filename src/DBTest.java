
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

//		JDBC 
//		1. ����̹� ã�� - ã�� ����̹��� 
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		2. DBMS�� ����
		String url = "jdbc:mysql://localhost:3306/t1?serverTimezone=UTC";
		String id = "sbsst"; // root
		String pw = "sbs123414"; // ����
		
		Connection conn = DriverManager.getConnection(url, id, pw); // ����
		
//		3. sql ���� ����
//		3.1 ������ sql��
		String sql = "SELECT * FROM article";
		
//		3.2 �ۼ��� sql���� DBMS�� ����.
//		Connection - ����, Statement - �ǹ���
//		sqló�� �ǹ��� �İ�
		
		Statement stmt = conn.createStatement();
		
//		3.3 DBMS���� ������ �����͸�  ResultSet���� ��ƿ�
//		ResultSet ��ȸ �����(������)�� ��� ����
//		stmt.executeQuery(sql); // ��ȸ ����� �ִ� ��� => select ��
//		stmt.executeUpdate(sql); // ��ȸ ����� ���� DB���� �ݿ��� �ϴ� ��� =>insert, update, delete
		
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
