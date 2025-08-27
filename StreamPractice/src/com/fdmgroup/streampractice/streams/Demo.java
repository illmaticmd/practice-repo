package com.fdmgroup.streampractice.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		Users mduser = new Users();
		mduser.setUsername("illmaticmd");

		List<Users> users = new ArrayList<>();
		users.add(mduser);

		System.out.println(users);

		List<String> usernames = new ArrayList<>();
		for (Users i : users) {
			usernames.add(i.getUsername());

		}

		usernames = users.stream().map(u -> u.getUsername()).collect(Collectors.toList()); // converts to a list or
																							// array if you want

		System.out.println(usernames);

	}

}
