package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class EmployeeUpdate {

	public static void main(String[] args) throws Exception  {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/myproject";
		String username = "root";
		String pwd = "PHW#84#jeor";
		//establishing connections
		Connection con = DriverManager.getConnection(url, username, pwd);
		//to update a row of a employee table
		PreparedStatement pst = con.prepareStatement("update employee set empname=? where empid=?");
		pst.setString(1, "Queen");
		pst.setInt(2, 4);
		int i=pst.executeUpdate();
		System.out.println("No.of rows updated:" + i);
		//to delete a row of employee table
		PreparedStatement st = con.prepareStatement("delete from employee where empid=2");
		int j=pst.executeUpdate();
		System.out.println("No.of rows effected:" + j);
		con.close();
		pst.close();
		st.close();


	}

}
