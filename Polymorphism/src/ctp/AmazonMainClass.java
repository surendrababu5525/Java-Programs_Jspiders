package ctp;

public class AmazonMainClass {
	public static void main(String[] args) {
		Amazon a = new Amazon();
		a.buy("laptop",500000);
		a.buy(40000);
		a.buy("cup");
		a.buy(25000,"Mobile Phone");
	}

}
