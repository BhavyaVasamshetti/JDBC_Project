package jdbc;

import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class EmployeeDetailsUpdate {

	public static void main(String[] args) throws Exception {

		try {

			// loading the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// establishing connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myproject", "root",
					"PHW#84#jeor");

			// creating a prepared statement
			PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?)");

			System.out.println("Enter Yes to Insert record of employee, No to exit : ");

			Scanner sc = new Scanner(System.in);

			String s = sc.next();

			if (s.equals("Yes")) {

				System.out.println("Enter the empid of employee to be inserted:");
				int empid = sc.nextInt();
				pstmt.setInt(1, empid);
				System.out.println("Enter the empname of employee to be inserted: ");
				String empname = sc.next();
				pstmt.setString(2, empname);
				System.out.println("Enter the empsalary of employee to be inserted: ");
				int empsalary = sc.nextInt();
				pstmt.setInt(3, empsalary);
				int i = pstmt.executeUpdate();
				System.out.println("No of rows inserted:" + i);
			}

			else if (s.equals("No")) {
				System.out.println("Program exited");
			}

			// closing connections
			con.close();
			sc.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
