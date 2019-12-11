package _01_JavaBasicExercises;
import java.util.*;
public class Ex12 {
	public static void main(String[] args){
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.println("Please provide first number");
		double firstNumber = sc.nextDouble();
		System.out.println("Please provide second number");
		double secondNumber = sc.nextDouble();
		System.out.println("Please provide third number");
		double thirdNumber = sc.nextDouble();
		double average = (firstNumber+secondNumber+thirdNumber)/3;
		System.out.println("The average from those three numbers is equal to "+average);
	}

}
