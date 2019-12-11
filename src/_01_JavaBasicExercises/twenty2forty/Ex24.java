package _01_JavaBasicExercises.twenty2forty;
// Write a Java program to compute the area of a hexagon. Area of a hexagon = (6 * s^2)/(4*tan(π/6))
//where s is the length of a side*//
import java.util.Scanner;
public class Ex24 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Input a length of hexagon side: ");
		double s = in.nextDouble();
		System.out.print("The area of the hexagon is: " + hexagonArea(s)+"\n");
	}
	public static double hexagonArea(double s) {
		return (6*(s*s))/(4*Math.tan(Math.PI/6));
	}
}
