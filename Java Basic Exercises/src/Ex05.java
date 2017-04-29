import java.util.*;
public class Ex05 {
	public static void main(String[] args){
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.println("Insert first number to multiply");
		int firstNum = sc.nextInt();
		System.out.println("Insert second number to multiply");
		int secondNum = sc.nextInt();
		int result = firstNum*secondNum;
		System.out.println("Multiply "+firstNum+" by "+secondNum+" gives "+result);
	}

}
