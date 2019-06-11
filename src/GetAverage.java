import java.util.Scanner;

/**
 * @author Jun
 * @version 1.0
 *
 */

public class GetAverage {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Tell me the mark of math");
		double math = input.nextDouble();
		System.out.println("Tell me the mark of science");
		double science = input.nextDouble();
		System.out.println("Tell me the mark of English");
		double english = input.nextDouble();
		double average = (math + science + english) / 3;
		System.out.println("The average of Math: " + math + ", Science: " + science 
				+ ", English: " + english + " is " + average + ".");
	}
}
