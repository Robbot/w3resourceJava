package _01_JavaBasicExercises.twenty2forty;
//Write a Java program to compare two numbers
import java.util.Scanner;
public class Ex32{
public static void main(String[] args) {
	int first_num,second_num;
	Scanner in = new Scanner (System.in);
	System.out.print("Input a first number: ");
	first_num = in.nextInt();
	System.out.print("Input a second number: ");
	second_num = in.nextInt();
	if ( first_num == second_num )           
        System.out.printf( "%d == %d\n", first_num, second_num );  
    if ( first_num != second_num )          
        System.out.printf( "%d != %d\n", first_num, second_num );  
    if ( first_num < second_num )          
        System.out.printf( "%d < %d\n", first_num, second_num );  
    if ( first_num > second_num )          
        System.out.printf( "%d > %d\n", first_num, second_num );  
    if ( first_num <= second_num )          
        System.out.printf( "%d <= %d\n", first_num, second_num );  
    if ( first_num >= second_num )          
        System.out.printf( "%d >= %d\n", first_num, second_num ); 
	
	}
}