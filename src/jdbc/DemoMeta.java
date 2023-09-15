package jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class DemoMeta {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myproject", "root", "PHW#84#jeor");
		Statement st = con.createStatement();

		ResultSet rset = st.executeQuery("select * from emp");
		ResultSetMetaData rsmd = rset.getMetaData();
		System.out.println("Table Details:");
		System.out.println("Table Name:" + rsmd.getTableName(1));
		System.out.println("no.of cloumns:" + rsmd.getColumnCount());
		System.out.println("Column Type:" + rsmd.getColumnTypeName(1));
		System.out.println("Column Type:" + rsmd.getColumnType(1));
		System.out.println("Coluumn Class Name:" + rsmd.getColumnClassName(1));
		System.out.println("Column Name:" + rsmd.getColumnName(1));

		DatabaseMetaData dbmd = con.getMetaData();
		System.out.println();
		System.out.println("Driver Details:");
		System.out.println("Driver Name: " + dbmd.getDriverName());
		System.out.println("Driver Version:" + dbmd.getDriverVersion());
		System.out.println("Url:" + dbmd.getURL());
		System.out.println("user name:" + dbmd.getUserName());
		System.out.println(dbmd.getTimeDateFunctions());
		System.out.println(dbmd.getMaxTableNameLength());
		System.out.println();
		System.out.println("DataBase Details:");
		System.out.println("Database Major Version:" + dbmd.getDatabaseMajorVersion());
		System.out.println("DB product Name:" + dbmd.getDatabaseProductName());
		System.out.println("DB Product Version:" + dbmd.getDatabaseProductVersion());
		con.close();
		st.close();

	}
}