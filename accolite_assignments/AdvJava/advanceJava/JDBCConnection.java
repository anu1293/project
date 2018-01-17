
/*
 * Singelton class for only one instance of connection object
 * */
package advanceJava;

import java.sql.Connection;

import java.sql.DriverManager;



public class JDBCConnection {
	private static Connection conn;
	private JDBCConnection() {
		try {
			String userName = "root";
			String password = "";
			String url = "jdbc:mysql://localhost:3306/StudentDatabase";
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, userName, password);
			System.out.println("connection !");
		} catch (Exception e) {
			System.out.println("Exception found" + e);
			closeConnection();
		}
	}

	private static class DAOHelper {
		private static final JDBCConnection dataobject_INSTANCE = new JDBCConnection();
	}

	public static JDBCConnection getInstance() {
		return DAOHelper.dataobject_INSTANCE;
	}

	public Connection Connect() {	
		return JDBCConnection.conn;
	}

	public void closeConnection() {
		try {
			conn.close();
		} 
		catch (Exception e) {
			System.out.println("Connection close error");
		}
	}
}
