import java.util.Scanner;

public class Test{
	public static void main(String[] args)
	{
		
		basicArithmetic();
	}
	
	
	//basic arithmetic test method
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
		
		//calculations, sum, product, average
		sum = numberOne + numberTwo + numberThree;
		product = numberOne * numberTwo * numberThree;
		average = sum/3.0;
		
		//sort the numbers
		int smallest = numberOne;
		int largest = numberOne;
		
		//find smallest number		
		if(numberTwo < smallest)
		{
			smallest = numberTwo;
		}
		
		if(numberThree < smallest)
		{
			smallest = numberThree;
		}
		
		//find largest number
		if(numberTwo > largest)
		{
			largest = numberTwo; 
		}
		
		if(numberThree > largest)
		{
			largest = numberThree;
		}
		
		//output the results to the user
		System.out.println("The sum is: " + sum);
		System.out.println("The product is: " + product);
		System.out.printf("The average is: %.2f\n", average);
		System.out.println("The smallest is: " + smallest);
		System.out.println("The largest is: " + largest);
	}
	
	
	
	
}