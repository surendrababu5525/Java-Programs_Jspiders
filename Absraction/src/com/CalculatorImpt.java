package com;

class CalculatorImpt implements Calculator { //rule2
	@Override //rule3
	public void add(int x,int y) {
		int sum = x+y;
		System.out.println("Sum of "+x+"&"+y+"is"+sum);
	}

}
