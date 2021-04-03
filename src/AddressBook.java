
import java.sql.SQLException;

public class AddressBook {

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Dao dao = new Dao();
		
		dao.selectArticles();
	}

}
