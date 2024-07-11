package rtp;

class FoodMain {
	// 1. Using Method
	static void display(FoodDeliveryApp obj) {
		obj.orderFood();
	}
	public static void main(String[] args) {
		display(new swiggy());
		display(new zomato());
		System.out.println("_________________");

		//2. Using single reference
		FoodDeliveryApp app;
		app=new swiggy();
		app.orderFood();
		app=new zomato();
		app.orderFood();

		//3. Using separate reference
		FoodDeliveryApp f1= new swiggy();
		f1.orderFood();
		FoodDeliveryApp f2= new zomato();
		f2.orderFood();
	}

}
