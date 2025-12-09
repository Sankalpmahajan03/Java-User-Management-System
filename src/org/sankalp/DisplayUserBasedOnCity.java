package org.sankalp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DisplayUserBasedOnCity {

	public void displayUserBasedOnCity(Scanner sc) {
		String QUERY = "Select * from userdetails where city =?";
		
		try(Connection con = DBconnection.getConnection();
				PreparedStatement prestat = con.prepareStatement(QUERY)) {
			
			
			System.out.println("Enter the city!");
			String city = sc.next();
			
			prestat.setString(1, city);
			
			
			ResultSet res = prestat.executeQuery();
			
			boolean found = false;
			
			
			while(res.next()) {
				found = true;
				System.out.println(res.getString(1) + " " + res.getString(2) + " " + res.getString(3));
			}
			if(!found) {
				System.out.println("User not found for"+city);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
