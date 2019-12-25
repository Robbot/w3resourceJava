package _01_JavaBasicExercises.twenty2forty;
import java.util.Scanner;

public class Ex27 {
	public static void main (String args[]) {
		String octal_num, hex_num;
		int decnum;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input an octal number: ");
		octal_num = in.nextLine();
		
		decnum = Integer.parseInt(octal_num,8);
		hex_num = Integer.toHexString(decnum);
		
		System.out.println("Equivalent number in hexdecimal is " + hex_num + "\n");
	}

}
