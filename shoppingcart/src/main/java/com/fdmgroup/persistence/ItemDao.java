package com.fdmgroup.persistence;

import java.util.List;

import com.fdmgroup.products.Item;

public interface ItemDao {

	List<Item> listItems();

	void addItem(Item product);

	Item getItem(String name);

	void removeItem(int id);

	void updateItem(Item product);

}
