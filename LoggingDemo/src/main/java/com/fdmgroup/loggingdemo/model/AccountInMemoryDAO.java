package com.fdmgroup.loggingdemo.model;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Class AccountInMemoryDAO encapsulates basic CRUD operations that can be
 * performed on an input list of Account elements.
 * 
 * @author McDesmond.Duru
 * 
 **/
public class AccountInMemoryDAO implements Crudable<Account, String> {

	private static final Logger LOG; // = LogManager.getLogger();

	static { // static initialization block
		LOG = LogManager.getLogger();
		LOG.trace("#<clinit>:: class loaded.");
	}

	{
		// INITIALIZATION BLOCK
		// runs when constructor is called
	}

	private List<Account> accounts;

	public AccountInMemoryDAO(List<Account> accounts) {
		// super(); //super has to be first line in constructor - implicitly puts in
		// super(); no args super

		// if (accounts == null) {
		// // new IllegalArgumentException("encountered null input argument.");
		// throw new IllegalArgumentException("encountered null input argument."); //
		// must "throw" in order to
		// }
		LOG.trace("#<init>:: instantiation: accounts=" + accounts);
		checkNull(accounts);

		this.accounts = accounts;
	}

	private void checkNull(Object obj) {

		LOG.trace("    #checkNull:: obj=" + obj);

		if (obj == null) {
			// new IllegalArgumentException("encountered null input argument.");

			IllegalArgumentException e = new IllegalArgumentException("encountered null input argument.");
			LOG.error(":: Exception thrown...", e);
			throw e; // must "throw" in order to
		}
	}
	

	public String foo(int i, double d) throws Exception {
		return null;
	}

	/**
	 * Adds the input Account instance to the in-memory list of accounts.
	 * 
	 * @param account
	 *            is an Account instance to be added.
	 * 
	 * @return true if the account is added, false otherwise.
	 * 
	 * @throws IllegalArgumentException
	 *             if account is null.
	 **/
	@Override
	public boolean create(Account account) {
		// if (account == null) {
		// // new IllegalArgumentException("encountered null input argument.");
		// throw new IllegalArgumentException("encountered null input argument."); //
		// must "throw" in order to
		// }
		LOG.trace("#create:: account= " + account);
		boolean created = false;
		checkNull(account);
		created = accounts.add(account);
		LOG.trace("    Returned= " + created);

		return created;
	}

	@Override
	public Account read(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Account account) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String username) {
		// TODO Auto-generated method stub
		return false;
	}

}
