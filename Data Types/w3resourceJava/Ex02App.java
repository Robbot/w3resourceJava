package w3resourceJava;
import java.util.*;

public class Ex02App {
	public static void main(String[] args){
		double meter, inch;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide number of inches ");
		inch = sc.nextDouble();
		
		Ex02 ext = new Ex02();
		ext.setInch(inch);
		
		ext.compute();
		
		meter = ext.getMeter();
		
		System.out.println("The number of meters for inches you provided is "+meter+" m");
		
	}
}
