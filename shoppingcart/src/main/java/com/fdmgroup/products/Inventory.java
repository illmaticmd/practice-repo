package com.fdmgroup.products;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Inventory")
public class Inventory {
	@Id
	@GeneratedValue
	private int inventory_id;
	@ElementCollection
	private Map<Item, Integer> products = new HashMap<>();

	public int getInventory_id() {
		return inventory_id;
	}

	public void add(Item p, int qty) {
		products.put(p, qty);
	}

	public void remove(Item p, int qty) {
		int temp = products.get(p);
		int newQty = (temp - qty);
		products.replace(p, newQty);
	}
}
