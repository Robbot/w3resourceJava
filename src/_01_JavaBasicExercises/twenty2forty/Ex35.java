package _01_JavaBasicExercises.twenty2forty;
//Write a Java program to compute the area of a polygon.
import java.util.Scanner;


public class Ex35 {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input the number of sides on the polygon");
		int n = in.nextInt();
		System.out.println("Input the length of one of the sides");
		double s = in.nextDouble();
		System.out.println("The area of polygon is "+polygonArea(n,s)+"\n");
		
	}
	//Area of a polygon = (n*s^2)/(4*tan(π/n))
	public static double polygonArea(int n, double s) {	
		return (n*(s*s))/(4.0*Math.tan((Math.PI/n)));
	}

}
