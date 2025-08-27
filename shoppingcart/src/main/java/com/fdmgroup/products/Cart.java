package com.fdmgroup.products;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Cart")
public class Cart {
	@Id
	@GeneratedValue
	private int cart_id;
	@OneToOne
	private Inventory cartInventory;
	
	public long getCart_id() {
		return cart_id;
	}
	public Inventory getCartInventory() {
		return cartInventory;
	}
	public void setCartInventory(Inventory cartInventory) {
		this.cartInventory = cartInventory;
	}
}
