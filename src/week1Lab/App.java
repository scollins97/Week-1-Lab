package week1Lab;

public class App {

	public static void main(String[] args) {
		
//create a variable to hold the quantity of seats left available on a flight
	int availableSeats = 60; 
//create a variable to hold the cost of groceries at checkout		
	double groceryTotal = 48.65;
//create a variable to hold a person's middle initial
	char middleInitial = 'R'; 
//create a variable to hold true if its hot outside and false if its cold outside
	boolean isItHotOutside = false; 
//create a variable to hold a person's first name
	String firstName = "Sean"; 
//create a variable to hold a street address
	String streetAddress = "Clocktower Place";
//print all variables to the console	
	System.out.println("Seats available on the plane:" + availableSeats);
	System.out.println("$" + groceryTotal);
	System.out.println("The person's middle initial is " + middleInitial);
	System.out.println("It is hot outside - " + isItHotOutside);
	System.out.println("The person's first name is " + firstName);
	System.out.println(streetAddress + " is where the person lives.");
	
	//a customer has booked 2 planes tickets. remove two seats
	//availableSeats = availableSeats - 2; 
	availableSeats -=2;
	System.out.println("Seats available on the plane:" + availableSeats);
	//impulse candy bar purchase, add 2.15 to the total 
	groceryTotal += 2.16;
	System.out.println("$" + groceryTotal);
	//birth certificate was printed incorrectly, change the middle initial to something else
	middleInitial = 'X';
	System.out.println("The person's middle initial is " + middleInitial);
	//the season has changed, update the hot variable to the opposite of what it was
	isItHotOutside = !isItHotOutside; 
	System.out.println("It is hot outside - " + isItHotOutside);
	//create a new variable of the person's full name using the first name, middle initial, and a last name of your choice
	String fullName = firstName + " " + middleInitial + " " + "Collins";
	System.out.println(fullName);
	//print a line introducing a customer and says they live at the address variable
	System.out.println("Hi, my name is " + fullName + ", and I live at " + streetAddress + ".");
	
	}//end

}
