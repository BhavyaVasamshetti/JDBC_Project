package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EmployeeDelete {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/myproject";
		String username = "root";
		String pwd = "PHW#84#jeor";
		//establishing connections
		Connection con = DriverManager.getConnection(url, username, pwd);
		//to delete a row of a employee table
		PreparedStatement pst = con.prepareStatement("delete from employee where empid=2");
		int i=pst.executeUpdate();
		System.out.println("No.of rows effected:" + i);
		con.close();
		pst.close();
	}

}
