package demo.oracle.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleConnection {
	private static final String DBURL =
			"jdbc:oracle:thin:@localhost:1521:evan";
	private static final String DBUSER = "scott";
	private static final String DBPASSWORD = "tiger";
	
	private static String query = 
			"SELECT * FROM emp WHERE comm IS NOT NULL";
	
	public static void main(String[] args) {
		Connection conn = null;
		Statement statement = null;
		ResultSet rs = null;
		
		try {
			
			// Two method of loading Oracle JDBC Driver
			// Method 1
			// Class.forName("oracle.jdbc.driver.OracleDriver()");
			
			// Method 2
			DriverManager.registerDriver(
					new oracle.jdbc.driver.OracleDriver());
			
			// Connect to Oracle Database
			conn = DriverManager.getConnection(DBURL, DBUSER, DBPASSWORD);
			statement = conn.createStatement();
			rs = statement.executeQuery(query);
			
			System.out.println("EMPNO" + "\t" + "ENAME" + "\t" + "JOB");
			System.out.println("------------------------");
			while (rs.next()) {
				System.out.println(rs.getInt(1) 
						+ "\t" + rs.getString(2)
						+ "\t" + rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (statement != null) {
					statement.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}	
}
