import java.util.Scanner;
public class only_if {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the two digits");
			int a=sc.nextInt();
			int b=sc.nextInt();
			
			int big=a;
			if(b>big)
				big=b;
				
				System.out.println(big+"is the biggest number");
			
			
		}

	}


