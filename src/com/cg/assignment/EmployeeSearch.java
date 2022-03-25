package com.cg.assignment;


import java.sql.Connection;
import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeSearch {



	public static void main(String args[]) throws SQLException {
		Scanner sc = new Scanner(System.in);
		String department;
		String designation;
		Connection con = null;
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/testdb1";
			String userName = "postgres";
			String password = "12345678";
			con = DriverManager.getConnection(url, userName, password);
			if(con!= null) {
				System.out.println("successfully connected:");
			}
				else {
					System.out.println("connection failed");
				}
			
			
		
		PreparedStatement stmt = con.prepareStatement("select * from employee where department = ? and designation = ? ;");
		System.out.print("Select the Department of the Employee among IT, Management, Production, Quality : ");
		department = sc.nextLine();
		try {
			stmt.setString(1, department);
		}catch(Exception e) {
		}
		
		System.out.print("Select the Designation of the Employee among tester, developer, manager, producer, hr, supervisor : ");
		designation = sc.nextLine();
		try {
			stmt.setString(2, designation);
		}catch(Exception e) {
		}
		
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next()) {
			System.out.println("Employee No. : "+rs.getString("emp_no"));
			System.out.println("Name : "+rs.getString("emp_name"));
			System.out.println("Salary : Rs."+rs.getString("salary"));
			System.out.println("Designation : "+rs.getString("designation"));
			System.out.println("Department : "+rs.getString("department"));
		}
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		try {
			con.close();
			System.out.println("Connection closed");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
}