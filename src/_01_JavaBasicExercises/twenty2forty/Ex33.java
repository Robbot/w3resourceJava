package _01_JavaBasicExercises;
//Write a Java program and compute the sum of the digits of an integer.
import java.util.Scanner;
public class Ex33 {
 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input an integer: ");
        long n = input.nextLong();
        System.out.println("The sum of the digits is: " + sumDigits(n));

    }

    public static int sumDigits(long n) {
        int sum = 0;
        while (n != 0) {
        	//https://stackoverflow.com/questions/43975824/what-is-the-operator-in-java 
        	//n%10 just reminder of n divided by 10
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
