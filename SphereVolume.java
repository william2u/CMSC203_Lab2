package lab2;
import java.util.Scanner;

public class SphereVolume 
{ 
public static void main(String[] args) 
{ 
// add your declaration and code here
double diam;
double radius;
double volume;
String output;

// Print the purpose of the program 
System.out.println("This calculate the volume of a given based on its diameter.");

// create a new scanner 
Scanner input = new Scanner(System.in);

// input the diameter of a sphere
System.out.println("Enter the diameter of a sphere: ");

// Read the diameter 
diam = input.nextDouble();

// Calculate the radius as diameter divided by 2
radius = diam / 2;

// Calculate volume of the sphere using the formula
volume  = (Math.PI*Math.pow(radius,3))*4/3;

// Print the volume 
output = "The sphere of diameter " + diam + " has a volume of " + volume;	
System.out.println(output);

// close the scanner
input.close();
} 
} 