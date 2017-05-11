package _01_JavaBasicExercises;
import java.util.*;
public class Ex11 {
	public static void main(String[] args){
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.println("Please provide radius of circle");
		double radius = sc.nextDouble();
		double perimeter = 2*Math.PI*radius;
		double area = Math.PI*radius*radius;
		System.out.println("Permieter of circle is "+perimeter);
		System.out.println("Area of circle is "+area);
	}
}
