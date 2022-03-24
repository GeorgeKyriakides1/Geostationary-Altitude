/*------------------------------------------------------
Name: George Kyriakides
Student number: 6796242
Email address: gk920@uowmail.edu.au
Subject Code: CSIT111
Assignment number: 1
-------------------------------------------------------*/

// GeoAltitude.java
// Used to calculate the geostationary altitude for any planet in our solar system which has one class that contains only one method main().

//Importing Modules
import java.util.Scanner; // Import Scanner class
import java.lang.Math;    // Import all members of Math class 

class GeoAltitude {
	public static void main(String[] args) { // Main method begins execution of GeoAltitude program
	
		final double GRAVITATIONAL_CONSTANT, EQUATORIAL_RADIUS, ROTATIONAL_PERIOD; // Constants are defined with final and they're all in uppercase letters. 
	   
		Scanner scanner = new Scanner(System.in); // Creates a scanner object to obtain input from the user in the command window
   
		//Displays Program Name and Instruction for the User
		System.out.println("- Geostationary Altitude Calculation -\n");
		System.out.println("Enter the planet parameters\n");
		  
		/* Program takes Parameters from User */
		System.out.print("Planet Name: "); // Displays Planet Name message as a prompt for user to enter planet name and then displays users input on the same line as prompt
		String planetName = scanner.nextLine(); // Reads a line of text being the Planet Name which is entered by the user and then holds the value as a String in the planetName variable
		  
		System.out.print("Gravitational Constant (km3/s2): "); // Displays Gravitational Constant message as a prompt for user to enter gravitational constant and then displays users input on the same line as prompt
		GRAVITATIONAL_CONSTANT = scanner.nextDouble(); // Reads the Gravitational Constant number value entered by user with double precision and then holds the value as either a large (or small) number or floating point value
		  
		System.out.print("Rotational Period (s): "); // Displays Rotational Period message as a prompt for user to enter rotational period and then displays users input on the same line as prompt
		ROTATIONAL_PERIOD = scanner.nextDouble(); // Reads the Rotational Period number value entered by user with double precision and then holds the value as either a large (or small) number or floating point value
		  
		System.out.print("Equatorial Radius (km): "); // Displays Equatorial Radius message as a prompt for user to enter equatorial radius and then displays users input on the same line as prompt
		EQUATORIAL_RADIUS = scanner.nextDouble(); // Reads the Equatorial Radius number value entered by user with double precision and then holds the value as either a large (or small) number or floating point value
		  
		//Calculating Orbital Radius
		double orbitalRadius = Math.cbrt((GRAVITATIONAL_CONSTANT*Math.pow(ROTATIONAL_PERIOD,2))/(4*Math.pow(Math.PI,2))); // double is used to perform calculation with double precision which it then holds the value r as either a large (or small) number or floating point value
		  
		//Calculating Geostationary Altitude
		double geostationaryAltitude = orbitalRadius - EQUATORIAL_RADIUS; // double is used to perform calculation with double precision which it then holds the value GA as either a large (or small) number or floating point value
		  
		//Final output of program displays the Geostationary Altitude to the User in the specific form of one decimal place
		System.out.printf("\nThe geostationary altitude of " + planetName + " is %.1f km.", geostationaryAltitude);
		
	}
}