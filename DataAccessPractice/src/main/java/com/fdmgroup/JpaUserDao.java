package com.fdmgroup;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class JpaUserDao implements UserDAO {
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");

	@Override
	public List<User> listUsers() {
		EntityManager em = emf.createEntityManager();
		TypedQuery<User> query = em.createQuery("SELECT u FROM User u", User.class);
		List<User> users = query.getResultList();
		em.close();
		return users;
	}

	@Override
	public void addUser(User user) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public User getUser(String username) {
		EntityManager em = emf.createEntityManager();
		TypedQuery<User> query = em.createQuery("SELECT u FROM User u WHERE username=?1", User.class);
		query.setParameter(1, username);
		User user;
		try {
		 user = query.getSingleResult();
		}catch(NoResultException e) {
			return null;
		}
		em.close();
		return user;
	}

	@Override
	public void removeUser(String username) {
		EntityManager em = emf.createEntityManager();
		TypedQuery<User> query = em.createQuery("SELECT u FROM User u WHERE username=?1", User.class);
		query.setParameter(1, username);
		em.getTransaction().begin();
		em.remove(query.getSingleResult());
		em.getTransaction().commit();
		em.close();

	}

	@Override
	public void updateUser(User user) {
		EntityManager em = emf.createEntityManager();
		User userInDb = em.find(User.class, user.getId());
		em.getTransaction().begin();
		
		userInDb.setEmail(user.getEmail());
		userInDb.setFirstName(user.getFirstName());
		userInDb.setLastName(user.getLastName());
		userInDb.setPassword(user.getPassword());
		userInDb.setRole(user.getRole());
		userInDb.setStatus(user.getStatus());
		
		em.getTransaction().commit();
		em.close();
	}

}
