package rtp;

class FoodDeliveryApp {
	void orderFood() {
		System.out.println("Ordering food");
	}
}

class swiggy extends FoodDeliveryApp{//IS A RELATIONSHIP
	@Override
	void orderFood() {//Override
		System.out.println("Ordering pizza from swiggy");
	}
}

class zomato extends FoodDeliveryApp{
	@Override
	void orderFood() {//Override
		System.out.println("Ordering Burger from zomato");
	}
}
