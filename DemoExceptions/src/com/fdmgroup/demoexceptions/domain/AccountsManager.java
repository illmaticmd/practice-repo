package com.fdmgroup.demoexceptions.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.ValidationEvent;

public class AccountsManager {

	private static final List<Account> ACCOUNTS = new ArrayList<>();

	public void create(String username, String password) {

		try {
			username = validate(username);
			password = validate(password);
			AccountsManager.ACCOUNTS.add(new Account(username, password));
		} catch (AccountsManagerUncheckedException e) {
			System.out.println(e.getClass() + ":: " + e.getMessage());
			// e.printStackTrace();
		}
	}

	private String validate(String input) {

		String trimmedInput = input.trim();
		if (trimmedInput.isEmpty() || trimmedInput.contains(" ")) {
			throw new AccountsManagerUncheckedException(
					"encountered input containing white space: '" + trimmedInput + "'");
		}

		return trimmedInput;
	}

	public List<Account> read() {
		return ACCOUNTS;
	}
}
