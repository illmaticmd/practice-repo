package com.fdmgroup.persistence;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.fdmgroup.products.Cart;

public class JpaCartDao implements CartDao{
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("omnistorage");
	@Override
	public List<Cart> listCarts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addCart(Cart cart) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cart getCart(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeCart(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCart(Cart cart) {
		// TODO Auto-generated method stub
		
	}

}
