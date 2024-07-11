import java.util.Scanner;
class CorrespondingMonth{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month number");
		int m=sc.nextInt();
		if(m==4||m==6||m==9||m==11)
			System.out.println("30");
		else if(m==28)
			System.out.println("28");
		else
			System.out.println("31");
	}
}