package Assignment;
import java.util.Scanner;
public class EvenOddWithinN {
	public static void main(String[] args) {
		int evensum=0;
		int oddsum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();

		while(n>0)
		{

			if(n%2==0)
			{
				evensum= evensum+n;
			}
			else
			{
				oddsum= oddsum+n;
			}
			n--;
		}
		System.out.println("sum of even total for given number is: "+evensum);
		System.out.println("sum of odd total for given number is: "+oddsum);


	}


}
