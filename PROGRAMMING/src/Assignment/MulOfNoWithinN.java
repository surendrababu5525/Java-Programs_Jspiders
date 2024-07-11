package Assignment;
import java.util.Scanner;
public class MulOfNoWithinN {
	public static void main(String[] args) {
		int i=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter then value:");
		int n = sc.nextInt();

		while(i<n)
		{
			if(i==1||i==3)
			{
				System.out.println(i);
			}
			else if(i%3==0)
			{
				System.out.println(i);
			}
			i++;
		}
	}

}
