package Multilevel;

public class MainClass {
	public static void main(String[] args) {

		Engineer en =new Engineer();

		System.out.println("The id of the Employee is: "+en.id);
		System.out.println("The name of the Engineer is: "+en.name);
		en.eat();
		en.work();
	}

}
