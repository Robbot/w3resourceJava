package _02_DataTypes;
import java.util.*;
import java.lang.Math;
public class Ex01 {
	public static void main(String[] args){
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.println("Please provide temperature in Fahrenheit");
		double fahrenheit = sc.nextDouble();
		double celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
		double rounded = Math.round(celsius*100.0) / 100.0;//this ugly thing * 100/100 is needed because Math.round (var,2) doesn't work somehow
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + rounded + " in Celsius");
	}

}
