package Assignment;
import java.util.Scanner;
public class NameNTimes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name");
		String name=sc.next();
		System.out.println("Enter the no of times to print: ");
		int t=sc.nextInt();
		while(t>0)
		{
			System.out.println(name);
			t--;
		}
	}


}
