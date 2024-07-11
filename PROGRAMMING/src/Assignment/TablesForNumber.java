package Assignment;
import java.util.Scanner;
public class TablesForNumber {
	public static void main(String[] args) {
		int i=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		while(i<=10)
		{
			System.out.println(n+"*"+i+"="+(i*n));
			i++;
		}
	}
}
