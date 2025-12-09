package org.sankalp;

import java.util.Scanner;

public class Entry {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice ;
		boolean status = false;
		
		do {
			System.out.println("Enter the choice!");
			System.out.println("Enter 1 to register USer!");
			System.out.println("Enter 2 to display All User based on City!");
			System.out.println("Enter 3 to change password of User!");
			System.out.println("Enter 4 to display User Information based on Username!");
			
			choice  = sc.nextInt();
			
			switch(choice) {
			case 1:{
				
				new RegisterUser().registerUser(sc);
				status = true;
				break;
			}
			case 2:{
		         if(!status) System.out.println("No Entry in the table!");
		         else {
		        	 new DisplayUserBasedOnCity().displayUserBasedOnCity(sc);
		         }
				break;
			}
			case 3:{
				if(!status) System.out.println("No Entry in the table!");
				else {
					new UpdatePassword().update(sc);
				}
				break;
			}
			case 4:{
				if(!status) System.out.println("No Entry in the table!");
				else {
					new DisplayUserDetails().Display(sc);
				}
				break;
			}
			default :{
				System.out.println("Enter a valid Choice!");
				break;
			}
			}
			
		}while(choice<6);

sc.close();
	}

}
