import java.util.Scanner;
class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value to check");
		int n=sc.nextInt();
		if(n%2==0)
			System.out.println("Even number");
		else
			System.out.println("not an even number");
	}
}
