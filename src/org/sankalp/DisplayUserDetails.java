package org.sankalp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DisplayUserDetails {
	
	
	public void Display(Scanner sc) {

	String QUERY = "select * from userdetails where Username = ?";
	
	try(Connection con = DBconnection.getConnection();
			PreparedStatement prestat = con.prepareStatement(QUERY)){
		
		System.out.println("Enter the Username!");
		String username = sc.next();
		
		prestat.setString(1, username);
		
		ResultSet rs = prestat.executeQuery();
		boolean found = false;
		
		while(rs.next()) {
			found = true;
			System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
		}
		if(!found)System.out.println("User not found !");
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	}
}
