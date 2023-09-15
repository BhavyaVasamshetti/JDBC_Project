package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BatchDemo {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myproject", "root", "PHW#84#jeor");
		PreparedStatement pst=con.prepareStatement("select * from emp");
		ResultSet rset=pst.executeQuery();
		while(rset.next())
			System.out.println(rset.getString(1)+" "+rset.getString(2));
		//inserting records into emp table
		pst.addBatch("insert into emp values('pinky',297)");
		pst.addBatch("insert into emp values('bhavya',296)");
		pst.addBatch("insert into emp values('shreeya',295)");
		int[] i=pst.executeBatch();
		System.out.println("no.of rows inserted:" + i.length);


	}

}
