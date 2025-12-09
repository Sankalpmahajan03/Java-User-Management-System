package org.sankalp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdatePassword {
	
	public void update(Scanner sc) {

	String QUERY = "update userdetails set Password = ? where Username = ?";
	
	
	try(Connection con = DBconnection.getConnection();
			PreparedStatement prestat = con.prepareStatement(QUERY)){
		
		System.out.println("Enter the User whose Password to be changed!");
		String username = sc.next();
		
		System.out.println("Enter the new Password!");
		String password = sc.next();
		
		prestat.setString(1, password);
		prestat.setString(2,username);
		
		int status = prestat.executeUpdate();
		if(status>0) System.out.println("Password Updated Sucessfully!");
		else System.err.println("Error Updating the Password!");
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	}
}
