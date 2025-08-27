package com.fdmgroup.shoppingcartcontroller;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fdmgroup.controller.ShoppingCartController;

public class ShoppingCartControllerTest {

	ShoppingCartController scc;
	
	@Test
	public void testGetCartPageReturnsCartPage() {
		String expected = scc.cartPage();
		
		assertEquals("cart", expected);
	}
	

}
