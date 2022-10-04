
public class PyramidExample {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.println("* ");
		        }
			System.out.println();
		}
		}

}

public class PyramidExampleReverse {
public static void main(string[]args) {
	         int term=6;
	         for(int i=1;i<=term;i++)
	                {
	        	       for(int j=term;j>=i;j--)
	        	       {
	        	    	   System.out.println("* ");
	        	       }
	        	       System.out.println();
	                }
             }
}
Floyd Triangle

import java.util.Scanner;
       class FloydsTriangle
       {
    	     public static void main(string args[])
    	     {
    	         rows,number = 1, counter, j;
    	    	 Scanner input = new Scanner(System.in);
    	    	 System.out.println("Enter the number of rows for floyd's triangle:");
    	    	 rows = input.nextInt();
    	    	 System.out.println("Floyd's triangle");
    	    	 System.out,println("****************");
    	    	 for ( counter = 1 ; counter <= rows ; counter++ )
    	    	 {
    	    		 for ( j = 1 ; j <= counter ; j++ )
    	    		 {
    	    			 System.out.println(number+" ");
    	    			 number++;
    	    		 }
    	    		 System.out.println()
    	    	 }
    	     }
       }

	        	       
	                



