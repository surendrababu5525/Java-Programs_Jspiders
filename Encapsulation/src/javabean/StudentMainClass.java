package javabean;

public class StudentMainClass {
	public static void main(String[] args) {
		
		Student s = new Student();
		s.setAge(20);
		int age = s.getAge();// storing
		System.out.println("Age: "+age);// and then printing
		System.out.println("Age:"+s.getAge());//printing straitly
	}

}
