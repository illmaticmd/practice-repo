package com.fdmgroup.demotdd.source;

public class ShapeShifter {

	public static final int LIMIT = 50;

	public Circle squareToCircle(Square square) {

		if (square.getSide() > LIMIT) {
			// create inscribed circle - and get raduis
			return new Circle(square.getSide() / 2);
		} else {
			// create circumscribed circle;
			return new Circle(square.getDiagonal() / 2);
		}

	}

}
