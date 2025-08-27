package com.fdmgroup.doa;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fdmgroup.persistence.CartDao;
import com.fdmgroup.persistence.JpaCartDao;
import com.fdmgroup.products.Cart;


public class JpaCartDaoTest {
	private CartDao classUnderTest = new JpaCartDao();

	@Test
	public void testIfCartDoesNotExist() {
		// arrange
		Cart cart = new Cart();
		Cart cartToAdd = new Cart();
		// act
		cart = classUnderTest.getCart(itemToAdd.getName());
		// assert
		assertNull(cart);
	}

}
