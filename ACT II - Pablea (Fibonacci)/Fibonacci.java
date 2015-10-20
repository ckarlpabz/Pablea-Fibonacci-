import java.util.Scanner;
public class Fibonacci {
	private static int c1 = 0, c2 = 1;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		System.out.print("Enter a number: ");
		number = input.nextInt();
		for(int a = 0; a < number; a++){
			System.out.print(c1 + ", "); 
			c1 = c1 + c2;
			c2 = c1 - c2;
		}	
	}
}