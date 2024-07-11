package Assignment;
import java.util.Scanner;
class divisorOfN{
	public static void main(String[] args) {
		int i=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();

		while(i<n)
		{
			if(n%i==0)
			{
				System.out.println(i);
				i++;
			}
			

		}
	}

}
