package javabean;

public class PersonMainClass {
	public static void main(String[] args) {

		Person p = new Person();
		p.setName("Sam");
		String name=p.getName();
		System.out.println("Name: "+name);
		// or below form
		System.out.println("Name: "+p.getName());
	}

}
