
import java.util.Scanner;
class CorrespondingMonthSwitch{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month number");
		int m=sc.nextInt();
		switch(m){
		case 1,3,5,7,8,10:
			System.out.println("31");
		break;
		case 4,6,9,11:
			System.out.println("30");
		break;
		case 2:
			System.out.println("28");
			break;
		default:
			System.out.println("invalid month");

		}
	}
}

