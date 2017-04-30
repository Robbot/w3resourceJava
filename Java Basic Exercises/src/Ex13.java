import java.util.*;
public class Ex13 {
	public static void main(String[] args){
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.println("Please provide width of rectangular");
		double width = sc.nextDouble();
		System.out.println("Please provide height of rectangular");
		double height = sc.nextDouble();
		double Area=width*height;
		System.out.println("Area is "+width+" * "+height+" = "+ Area);
		double perimeter = 2*(width+height);
		System.out.println("Perimeter is 2 * ("+width+" + "+height+") = "+perimeter);
	}

}
