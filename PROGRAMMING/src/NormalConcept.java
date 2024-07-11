import java.util.Scanner;

public class NormalConcept {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int big=a;
		if(b>big)
			big=b;
		if(c>big)
			big=c;
		System.out.println(big+"is the biggest number");

	}
}
