package rtp;

class MainClass {
	//1. if display(new Developer());-> Employee obj = new Developer();->obj.work();
	//2.if display(new Tester());-> Employee obj = new Tester();->obj.work();
	static void display(Employee obj) {
		obj.work();
	}
	public static void main(String[] args) {
		//1. Upcasting using method
		display(new Developer());
		display(new Tester());
		System.out.println("---------------");

		//2. upcasting using a single reference variable
		Employee emp;
		emp=new Developer();
		emp.work();
		emp=new Tester();
		emp.work();

		System.out.println("---------------");

		//3. Upcasting using separate reference variable
		Employee e1 = new Developer();
		e1.work();
		Employee e2 = new Tester();
		e1.work();


	}

}
