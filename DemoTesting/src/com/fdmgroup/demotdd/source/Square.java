package com.fdmgroup.demotdd.source;

public class Square {

	private int side;
	//private int perimeter;
	
	public Square(int side) {
		
		this.side = Math.abs(side); //this.side accesses the private int side outside method - highlighted by IDE
	}

	public int getSide() {

		return this.side;
	}

	public int getPerimeter() {
		//perimeter = 4*side;
		return 4*side;
	}

	public int getArea() {
		
		return side*side;
	}

	public double getDiagonal() {
		// TODO Auto-generated method stub
		return side * Math.sqrt(2.0);
	}

}
