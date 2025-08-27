package com.fdmgroup.demoio.buffered;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReadFromWriteTo readFromWriteTo = new ReadFromWriteTo("data/example.txt", "output.txt");

		readFromWriteTo.getPut();

	}

}
