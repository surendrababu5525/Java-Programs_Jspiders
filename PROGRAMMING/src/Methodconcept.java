import java.util.Scanner;
class Methodconcept 
{
	static int execution(int a,int b,int c){
		int big=a;
		if(b>big)
			big=b;
		if(c>big)
			big=c;
		return big;

	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int rs=execution(a,b,c);
		System.out.println(rs+"is the biggest number");

	}

}
