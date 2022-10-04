
public class QuotientRemainder {

	public static void main(String[] args) {
		int divided = 25, divisor = 4;
		
		int quotient = dividend / divisor;
		int remainder = dividend % divisor;
		
		System.out.println("Quotient = " + quotient);
		System.out.println("Remainder = " + remainder);

	}

}

import java.util.scanner;
class oddorEven
{
	public static void main(string args[])
	{
		int num;
		System.out.println("Enter an Integer number:");
		
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		
		if ( num % 2 == 0 )
			System.out.println("Entered number is even");
		else
			System.out.println("Entered number is odd");
		}
	}
