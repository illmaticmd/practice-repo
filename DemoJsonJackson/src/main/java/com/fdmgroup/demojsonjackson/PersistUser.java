package com.fdmgroup.demojsonjackson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class PersistUser {
	
	public static final String JSON_PATH = "users.json";
	
	private ObjectMapper objectMapper = new ObjectMapper();
	
	public void serialize(User user) {
		
		File file = new File(JSON_PATH);
		
		try (FileWriter fileWriter = new FileWriter(file);) {
			objectMapper.writer().forType(User.class).writeValue(fileWriter, user);
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		

	}
	public User deserialize() {
		
		User user = null;
		
		File file = new File(JSON_PATH);
		
		try (FileReader fileReader = new FileReader(file);){
			user = objectMapper.reader().forType(User.class).readValue(fileReader);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return user;
		
	}
}
