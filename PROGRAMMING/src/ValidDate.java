import java.util.Scanner;
class ValidDate{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date");	
		int d=sc.nextInt();
		System.out.println("Enter the Month");
		int m=sc.nextInt();
		System.out.println("Enter the year");
		int y=sc.nextInt();
		if(d<1||d>31 && m<1||m<12 && y<1)
			System.out.println("invalid");
		else if ((y%400==0||y%4==0&&y%100!=0)==false && m==2 && d>28)
			System.out.println("invalid");
		
		else
			System.out.println("Valid");


	}
}
