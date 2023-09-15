package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Studentinfo {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Statement stmt = null;
		ResultSet rset = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/myproject";
			String user = "root";
			String pwd = "PHW#84#jeor";
			con = DriverManager.getConnection(url, user, pwd);
			stmt = con.createStatement();
			rset = stmt.executeQuery("select * from employee");
			while (rset.next())
				System.out.println(rset.getString("empname") + " " + rset.getInt("empid") );
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			con.close();
			stmt.close();
			rset.close();

		}
	}

}
