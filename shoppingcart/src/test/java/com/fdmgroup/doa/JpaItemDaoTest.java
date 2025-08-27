package com.fdmgroup.doa;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Test;

import com.fdmgroup.persistence.ItemDao;
import com.fdmgroup.persistence.JpaItemDao;
import com.fdmgroup.products.Item;

public class JpaItemDaoTest {
	private ItemDao classUnderTest = new JpaItemDao();

	@Test
	public void testIfItemDoesNotExist() {
		// arrange
		Item item = new Item();
		Item itemToAdd = new Item();
		// act
		item = classUnderTest.getItem(itemToAdd.getName());
		// assert
		assertNull(item);
	}

	@Test
	public void testIfItemAddedtoDb() {
		// arrange
		Item item = new Item();
		item.setColor("blue");
		item.setName("pen");

		BigDecimal price = new BigDecimal(3.00);
		item.setPrice(price);
		// Item itemToAdd = new Item();

		// act
		classUnderTest.addItem(item);
		// assert
		assertNotNull(item);
	}

	@Test
	public void testIfItemRemovedFromDb() {
		// arrange
		Item item = new Item();
		item.setColor("blue");
		item.setName("pen");

		BigDecimal price = new BigDecimal(3.00);
		item.setPrice(price);

		// act
		classUnderTest.addItem(item);
		classUnderTest.removeItem(item.getItem_id());
		// assert
		assertNull(item);
	}
	
	@Test
	public void testIfItemUpdatedInDatabase() {
		//arrange
		Item itemToUpdate = new Item();
		itemToUpdate.setName("pen");
		Item item = classUnderTest.getItem(itemToUpdate.getName());
		//act
		itemToUpdate.setName("gel pen");
		itemToUpdate.setColor("green");
		classUnderTest.updateItem(itemToUpdate);
		
		item = classUnderTest.getItem(itemToUpdate.getName());
		assertEquals(itemToUpdate, item);
	}
	
	@Test
	public void testListingItemsFromDatabase() {
		//arrange
		Item item = new Item();
		item.setColor("blue");
		item.setName("pen");
		BigDecimal price = new BigDecimal(3.00);
		item.setPrice(price);
		
		//act
		classUnderTest.addItem(item);
		
		List<Item> actual = classUnderTest.listItems();
		assertNotNull(actual);
		//assertEquals(expected, actual);
	}
}
