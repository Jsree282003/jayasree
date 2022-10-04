import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		int temp;
		boolean is Prime=true;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number:");
		int num=scan.nextInt();
		 scan.close();
		for(int i=2;i<=num/2;i++)
		{
			temp=num%i;
		  if(temp==0)
		  {
			  is Prime=false;
			  break;
		  }
		}
		if(isPrime)
			System.out.println(num + " is a Prime Number");
		else
			System.out.println(num + " is not a Prime Number");

	}

}
