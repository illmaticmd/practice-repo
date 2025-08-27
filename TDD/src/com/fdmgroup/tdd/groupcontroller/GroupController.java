package com.fdmgroup.tdd.groupcontroller;

import java.util.Map;

public class GroupController implements GroupControllerService{

	private DatabaseReader dataBaseReader;
	private DatabaseWriter dataBaseWriter;
	
	public GroupController(DatabaseReader dataBaseReader) {
		super();
		this.dataBaseReader = dataBaseReader;
	}
	
	public GroupController(DatabaseWriter dataBaseWriter) {
		super();
		this.dataBaseWriter = dataBaseWriter;
	}


	@Override
	public Map<String, Trainee> getAllTrainees() {
		return dataBaseReader.readGroup();
	}

	@Override
	public void addTrainee(Trainee trainee) {
		dataBaseWriter.addTrainee(trainee);
	}

	@Override
	public void removeTraineeByUsername(String traineeUsername) {
		dataBaseWriter.deleteTraineeByUsername(traineeUsername);
	}

}
