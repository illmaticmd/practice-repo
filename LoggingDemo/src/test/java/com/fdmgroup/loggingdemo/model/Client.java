package com.fdmgroup.loggingdemo.model;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccountInMemoryDAO accountInMemoryDAO = new AccountInMemoryDAO(new ArrayList<>());

		Account account = new Account("username", "password");

		accountInMemoryDAO.create(account);
	}

}
