package jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class DemoDataBaseMetaData {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myproject", "root", "PHW#84#jeor");
		DatabaseMetaData dbmd=con.getMetaData();
		System.out.println("Driver Name: "+dbmd.getDriverName());
		System.out.println("Driver Version:"+dbmd.getDriverVersion());
		System.out.println("Product Name:"+dbmd.getDatabaseProductName());
		System.out.println("Product Version:"+dbmd.getDatabaseProductVersion());
		System.out.println("DB Major Version:"+dbmd.getDatabaseMajorVersion());
		System.out.println("Url:"+dbmd.getURL());
		System.out.println("user name:"+dbmd.getUserName());
		System.out.println(dbmd.getTimeDateFunctions());
		System.out.println(dbmd.getMaxTableNameLength());
		


	}

}
