import java.util.Scanner;
public class Ex06 {
	public static void main(String[] args){
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.println("Insert first number");
		int firstNum = sc.nextInt();
		System.out.println("Insert second number");
		int secondNum = sc.nextInt();
		int multiply = firstNum*secondNum;
		int subtract = firstNum-secondNum;
		int add = firstNum+secondNum;
		int divide=firstNum/secondNum;
		int reminder = firstNum%secondNum; 
		System.out.println("Multiply "+firstNum+" by "+secondNum+" gives "+multiply);
		System.out.println("Subtract "+firstNum+" minus "+secondNum+" gives "+subtract);
		System.out.println("Adding "+firstNum+" to "+secondNum+" gives "+add);
		System.out.println("Divide "+firstNum+" by "+secondNum+" gives "+divide);
		System.out.println("Reminder "+firstNum+" by "+secondNum+" gives "+reminder);
	}

}
