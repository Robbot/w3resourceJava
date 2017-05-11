package _02_DataTypes;
import java.util.*;
public class Ex01 {
	public static void main(String[] args){
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.println("Please provide temperature in Fahrenheit");
		double fahrenheit = sc.nextDouble();
		double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
	}

}
