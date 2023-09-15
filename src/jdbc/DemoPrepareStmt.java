package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DemoPrepareStmt {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/myproject";
		String username = "root";
		String pwd = "PHW#84#jeor";
		Connection con = DriverManager.getConnection(url, username, pwd);
//		PreparedStatement pst = con.prepareStatement("insert into employee values('kim',6)");
		PreparedStatement pst = con.prepareStatement("insert into employee values(?,?)");
		pst.setString(1, "aa");
		pst.setInt(2, 12);
		int i = pst.executeUpdate();
		pst.setString(1, "bb");
		pst.setInt(2, 13);
		i+=pst.executeUpdate();
		System.out.println("No.of rows inserted:" + i);
		con.close();
		pst.close();

	}

}
