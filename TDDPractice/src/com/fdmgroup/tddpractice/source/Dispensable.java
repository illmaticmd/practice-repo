package com.fdmgroup.tddpractice.source;

public interface Dispensable {
	
	int exchange(Denominations usBanknote);
	
	void refill();
	
	void empty();
}
