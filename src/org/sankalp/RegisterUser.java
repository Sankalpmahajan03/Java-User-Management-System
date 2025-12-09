package org.sankalp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.sql.SQLException;

public class RegisterUser {
	
	public void registerUser(Scanner sc) {
        String QUERY = "INSERT INTO userdetails (Username, Password, City) VALUES (?, ?, ?)";

        try (Connection con = DBconnection.getConnection();
             PreparedStatement prestat = con.prepareStatement(QUERY))
             {

            System.out.print("Enter Username: ");
            String username = sc.next();

            System.out.print("Enter Password: ");
            String password = sc.next();

            System.out.print("Enter City: ");
            String city = sc.next();

            prestat.setString(1, username);
            prestat.setString(2, password);
            prestat.setString(3, city);

            int count = prestat.executeUpdate();

            if (count > 0)
                System.out.println("Registered User Successfully!");
            else
                System.out.println("Error Registering User!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
