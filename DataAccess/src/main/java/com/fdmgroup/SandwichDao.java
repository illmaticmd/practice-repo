package com.fdmgroup;

import java.util.Set;

public interface SandwichDao {

	Sandwich readSandwich(String sandwichName);

	boolean write(Sandwich sandwich);

	void delete(String sandwichName);

	Set<Sandwich> readAll();

}
