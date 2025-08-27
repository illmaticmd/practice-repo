package com.fdmgroup.persistence;

import java.util.List;

import com.fdmgroup.products.Inventory;


public interface InventoryDao {
	List<Inventory> listInventories();

	void addInventory(Inventory inventory);

	Inventory getInventory(int id);

	void removeInventory(int id);

	void updateInventory(Inventory inventory);
}
