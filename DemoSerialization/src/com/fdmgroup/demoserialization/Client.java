package com.fdmgroup.demoserialization;

public class Client {

	public static void main(String[] args) {


		User ClartKent = new User ("ckent","superman", "Clark", "Kent");
		System.out.println(ClartKent);

		PersistUser persistUser = new PersistUser();
		persistUser.serialize(ClartKent);
		
		User deserializedUser = persistUser.deserialize();
		System.out.println(deserializedUser);
		
		System.out.println("clarkKent == deserializedUser = " + (ClartKent == deserializedUser));
	}

}
