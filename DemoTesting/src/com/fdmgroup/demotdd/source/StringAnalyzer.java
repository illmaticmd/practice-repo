package com.fdmgroup.demotdd.source;

public class StringAnalyzer {

	// public boolean isPalendrome(String input) {

	// if (input.length() == 1) {
	// return true;
	// } - dont need anymore

	// if (input.charAt(0) == input.charAt(input.length()-1)) {
	// return true;
	// }//need double == for boolean
	// else {
	// return false;
	// } - dont need this either anymore

	//
	// int inputEnd = input.length()-1;
	//
	// int boundaryIndex = input.length()/2;
	//
	// for(int i=0;i<boundaryIndex;i++) {
	// if (input.charAt(i) != input.charAt(inputEnd - i)) {
	// return false;
	// }
	// }
	// return true; //return true because it has made it out of the for loop

	// return input.charAt(0) == input.charAt(inputEnd);

	// now we implement recursion
	public boolean isPalendrome(String input) {

		validate(input);
		
		return doEndsMatch(input, 0, input.length() - 1);

	}

	private void validate(String input) {
		
		if (input == null || input.trim().isEmpty()) {
			throw new IllegalArgumentException("Invalid input argument!");
		}
		
	}

	private boolean doEndsMatch(String input, int startPosition, int endPosition) {

		if (startPosition > endPosition) { //for when we've reached our goal
			return true;
		}

		if (input.charAt(startPosition) == input.charAt(endPosition)) {
			//startPosition +=1;
			//endPosition -=1;
			return doEndsMatch(input, ++startPosition, --endPosition);
		}
		return false;
	}

}
