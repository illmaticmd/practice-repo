package com.fdmgroup.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.fdmgroup.products.Inventory;
import com.fdmgroup.products.Item;

public class JpaInventoryDao implements InventoryDao {
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("omnistorage");

	@Override
	public List<Inventory> listInventories() {
		EntityManager em = emf.createEntityManager();

		TypedQuery<Inventory> query = em.createQuery("SELECT i FROM Inventory i", Inventory.class);

		List<Inventory> invs = query.getResultList();

		em.close();
		return invs;
	}

	@Override
	public void addInventory(Inventory inventory) {
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.persist(inventory);
		em.getTransaction().commit();

		em.close();
	}

	@Override
	public Inventory getInventory(int id) {
		EntityManager em = emf.createEntityManager();

		TypedQuery<Inventory> query = em.createQuery("SELECT i FROM Inventory i WHERE inventory_id=?1",
				Inventory.class);
		query.setParameter(1, id);
		Inventory inv;
		try {
			inv = query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
		em.close();
		return inv;
	}

	@Override
	public void removeInventory(int id) {
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.remove(em.find(Inventory.class, id));
		em.getTransaction().commit();

		em.close();
	}

	@Override
	public void updateInventory(Inventory inventory) {
		EntityManager em = emf.createEntityManager();

		Inventory invInDb = em.find(Inventory.class, inventory.getInventory_id());
		em.getTransaction().begin();



		em.getTransaction().commit();
		em.close();
	}

}
