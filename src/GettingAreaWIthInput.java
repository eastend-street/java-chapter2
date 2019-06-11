import java.util.Scanner;

public class GettingAreaWithInput {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Tell me the radius in cm");
		double radius = input.nextDouble();
		double area = radius * radius * 3.14;
		System.out.println("The area is " + area);
		input.close();
	}
}
