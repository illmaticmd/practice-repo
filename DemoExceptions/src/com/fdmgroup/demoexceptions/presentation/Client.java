package com.fdmgroup.demoexceptions.presentation;

import com.fdmgroup.demoexceptions.domain.Account;
import com.fdmgroup.demoexceptions.domain.AccountsManager;
import com.fdmgroup.demoexceptions.domain.AccountsManagerCheckedException;

public class Client {

	public static void main(String[] args)  {

		// Vehicle metalmovingmachine = new Car();
		// if (metalmovingmachine instanceof Truck) {
		// Truck truckvehicle = (Truck) metalmovingmachine;
		// }

		// Account account = new Account("ckent", "supermamn");

		AccountsManager accountsManager = new AccountsManager();

		try {
			accountsManager.create("ckent", "superman");
			accountsManager.create("   bwayne   ", " batman     ");
			accountsManager.create("cbrown", "good grief");
			accountsManager.create("t stark", "ironman");
			accountsManager.create("   pparker ", "spiderman");
		} finally {
			System.out.println("Registered accounts...");
			for (Account account : accountsManager.read()) {
				System.out.println(account);
			}
		}
	}

}
