package com.fdmgroup.persistence;

import java.util.List;

import com.fdmgroup.products.Cart;

public interface CartDao {
	List<Cart> listCarts();

	void addCart(Cart cart);

	Cart getCart(String name);

	void removeCart(int id);

	void updateCart(Cart cart);
}
