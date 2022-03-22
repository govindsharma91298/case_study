import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Covid {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		Class.forName("org.postgresql.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/postgres","postgres","Deadp00l");
		Statement stmt = conn.createStatement();
		
		ResultSet rs = stmt.executeQuery("SELECT location, Count(total_cases ) FROM public.coviddata WHERE new_cases> 1000 GROUP BY location,total_cases order by total_cases;");
		while(rs.next()) {
			System.out.println(rs.getString("location"));
		}
		
		conn.close();
	}

}