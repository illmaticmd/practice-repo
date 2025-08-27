package com.fdmgroup.demologging.model;

import java.util.List;

public class AccountInMemoryDAO implements Crudable<Account, String> {

	private List<Account> accounts;
	
	public boolean create(Account account) {
		// TODO Auto-generated method stub
		return false;
	}

	public Account read(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean update(Account account) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(String username) {
		// TODO Auto-generated method stub
		return false;
	}

}
