package com.fdmgroup.doa;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import com.fdmgroup.persistence.InventoryDao;
import com.fdmgroup.persistence.JpaInventoryDao;
import com.fdmgroup.products.Inventory;
import com.fdmgroup.products.Item;

public class JpaInventoryDaoTest {
	private InventoryDao classUnderTest = new JpaInventoryDao();

	@Test
	public void testIfInventoryDoesNotExist() {
		// arrange
		Inventory inv = new Inventory();
		Inventory invToAdd = new Inventory();
		// act
		inv = classUnderTest.getInventory(invToAdd.getInventory_id());
		// assert
		assertNull(inv);
	}

	@Test
	public void testIfItemsGetAddedtoInventory() {
		// arrange
		Inventory inv = new Inventory();
		Item p = new Item();
		p.setName("pen");
		p.setColor("yellow");
		int qty = 3;

		// act
		inv.add(p, qty);
		// assert
		assertNotNull(inv);
	}

	@Test
	public void testIfItemsGetRemovedFromInventory() {
		// arrange
		Inventory inv = new Inventory();
		Item p = new Item();
		p.setName("pen");
		p.setColor("yellow");

		int qty = 3;


		// act
		inv.remove(p, qty);
		// assert
		assertNull(inv);
	}

	@Test
	public void testIfInventoryAddedtoDb() {
		// arrange
		Inventory inv = new Inventory();
		Item p = new Item();
		p.setName("pen");
		p.setColor("yellow");

		int qty = 3;
		inv.add(p, qty);

		// act
		classUnderTest.addInventory(inv);
		// assert
		assertNotNull(inv);
	}

	@Test
	public void testIfInventoryRemovedFromDb() {
		// arrange
		Inventory inv = new Inventory();
		Item p = new Item();
		p.setName("pen");
		p.setColor("yellow");
		int qty = 3;
		inv.add(p, qty);

		// act
		classUnderTest.addInventory(inv);

		classUnderTest.removeInventory(inv.getInventory_id());
		// assert
		assertNotNull(inv);
	}
}
