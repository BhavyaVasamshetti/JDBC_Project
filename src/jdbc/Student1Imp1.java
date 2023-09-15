package jdbc;

//1.import packages
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;

public class Student1Imp1 {

	public static void main(String[] args) throws Exception {
		// 2.loading the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/myproject";
		String username="root";
		String pwd="PHW#84#jeor";
		// 3.establishing connection
		Connection con=DriverManager.getConnection(url, username, pwd);
		//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myproject", "root", "PHW#84#jeor");
		// 4.create stmt
		Statement st = con.createStatement();
		// 5.execute stmt
		ResultSet set = st.executeQuery("select * from student");
		// 6.print the o/p
		System.out.println("sname:"+" "+"sid:"+" "+"sage:");
		while (set.next())
			// System.out.println(set.getString("sname"));
			System.out.println(set.getString("sname")+" "+set.getInt("sid")+" "+set.getInt("sage"));
		// 7.close connections
		con.close();
		st.close();
		set.close();

	}

}
