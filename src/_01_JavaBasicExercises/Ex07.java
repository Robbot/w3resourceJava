package _01_JavaBasicExercises;
import java.util.Scanner;
public class Ex07 {
	public static void main(String[] args){
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.println("Insert a number");
		int num1 = sc.nextInt();
	
		  for (int i=0; i< 10; i++) {  
			System.out.println(num1 + " x " + (i+1) + " = " +  (num1 * (i+1)));  
			}
	}
}