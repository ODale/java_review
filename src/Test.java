import java.util.Scanner;

public class Test{
	public static void main(String[] args)
	{
		
		basicArithmetic();
	}
	
	public static void basicArithmetic()
	{
		//instantiate Scanner object to read keyboard inputs
		Scanner input = new Scanner(System.in);
		
		//variable declaration
		int numberOne, numberTwo, numberThree, sum = 0, product = 0;
		double average = 0.0;
		
		//get user inputs
		System.out.println("Enter first number: ");
		numberOne = input.nextInt();
		System.out.println("Enter sencond number: ");
		numberTwo = input.nextInt();
		System.out.println("Enter third number: ");
		numberThree = input.nextInt();
		
		//close scanner
		input.close();
		
		//calculations
		sum = numberOne + numberTwo + numberThree;
		product = numberOne * numberTwo * numberThree;
		average = sum/3.0;
		
		//output the results to the user
		System.out.println("The sum is: " + sum);
		System.out.println("The product is: " + product);
		System.out.println("The average is: " + average);
	}
}