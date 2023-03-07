//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package week01;

public class Week01varopslab {

	public static void main(String[] args) {

		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight		
int freeSeats = 10;
		
		// 2. Create a variable to hold the cost of groceries at checkout
double grocerieCost = 6.25;
		
		// 3. Create a variable to hold a person's middle initial
char middleInitial = 'A';
	
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
boolean isHotOutside = true;
		
		// 5. Create a variable to hold a customer's first name
String firstName = "David";
		
		// 6. Create a variable to hold a street address
String streetAdress = "666 Fulton St";

		// 7. Print all variables to the console
System.out.println("free seats:" + freeSeats);	
System.out.println("grocerie cost:" + grocerieCost);
System.out.println("MI:" + middleInitial);	
System.out.println("Is it hot:" + isHotOutside);	
System.out.println("First Name:" + firstName);	
System.out.println("Street Adress:" + streetAdress);	
		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
freeSeats -= 2;
System.out.println("free seats:" + freeSeats); 
		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;
grocerieCost = grocerieCost + 2.15;

		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
middleInitial = 'S';		

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
isHotOutside = false;

		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
String fullName = firstName + " " + middleInitial +" "+ "Atwood ";	

		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
System.out.println("Hi my name is " + fullName + "I live at " + streetAdress );
		
		
	}
}