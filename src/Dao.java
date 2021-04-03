import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Dao {
	
	public ArrayList<Article> selectArticles() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/t1?serverTimezone=UTC";
		String id = "sbsst"; // root
		String pw = "sbs123414"; // 공백

		Connection conn = DriverManager.getConnection(url, id, pw); // 연결

		String sql = "SELECT * FROM article";

		Statement stmt = conn.createStatement();

		ResultSet rs = stmt.executeQuery(sql);
		
		ArrayList<Article> articles = new ArrayList<>();
		
		while (rs.next()) {

			String title = rs.getString("title");
			String body = rs.getString("body");

			Article a = new Article(title, body);
			articles.add(a);
		}

		if (rs != null) {
			rs.close();
		}
		if (stmt != null) {
			stmt.close();
		}
		if (conn != null) {
			conn.close();
		}
		return articles;
	}
}






























