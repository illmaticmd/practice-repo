package com.fdmgroup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import oracle.jdbc.driver.OracleDriver;

public class JdbcSandwichDao implements SandwichDao {

	public JdbcSandwichDao() {
		try {
			DriverManager.registerDriver(new OracleDriver());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// public JdbcSandwichDao(String sandwichName) {
	// try (Connection connection =
	// DriverManager.getConnection("jdbc:oracle:thin:trainee1/!QAZSE4@localhost:1521:xe")){
	// Statement statement = connection.createStatement();
	// String query = "SELECT bread FROM sandwiches WHERE
	// sandwich_name="+sandwichName+"'";
	//
	// ResultSet rs = statement.executeQuery(query);
	// rs.next();
	// String bread = rs.getString("bread");
	// Sandwich sandwich = new Sandwich();
	// sandwich.setBread(bread);
	// sandwich.setName(sandwichName);
	// return sandwich;
	//
	//
	// } catch (SQLException e) {
	// e.printStackTrace();
	// }
	// }

	@Override
	public Sandwich readSandwich(String sandwichName) {
		try (Connection connection = DriverManager
				.getConnection("jdbc:oracle:thin:trainee1/!QAZSE4@localhost:1521:xe")) {
			Statement statement = connection.createStatement();
			String query = "SELECT bread FROM sandwiches WHERE sandwich_name='" + sandwichName + "'";

			PreparedStatement statement = connection.prepareStatement(query);
			
			ResultSet rs = statement.executeQuery();
			
			rs.next();
			
			ResultSet rs = statement.executeQuery(query);
			rs.next();
			String bread = rs.getString("bread");
			Sandwich sandwich = new Sandwich();
			sandwich.setBread(bread);
			sandwich.setName(sandwichName);
			return sandwich;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private Connection getConnection() throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:trainee1/!QAZSE4@localhost:1521:xe");
		return connection;
	}

	@Override
	public boolean write(Sandwich sandwich) {

		try (Connection connection = getConnection()) {
			Statement statement = connection.createStatement();
			String insert = "INSERT INTO DAUsers (sandwich_name, bread) VALUES ('" + sandwich.getName() + "','"
					+ sandwich.getBread() + "')";

			statement.executeUpdate(insert);
			return true;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public void delete(String sandwichName) {
		try (Connection connection = getConnection()){
			
			Statement statement = connection.createStatement();
			String delete = "DELETE FROM sandwiches WHERE sandwich_name='"+sandwichName+"'";
			
			statement.executeUpdate(delete);
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		

		
	}

	@Override
	public Set<Sandwich> readAll() {
		try (Connection connection = getConnection()){
			Statement statement = connection.createStatement();
			String query = "SELECT sandwich_name, bread FROM sandwiches";
			
			ResultSet rs = statement.executeQuery(query);
			Set<Sandwich> sandwiches = new HashSet<>();
			while(rs.next()) {
				String name = rs.getString("sandwich_name");
				String bread = rs.getString("bread");
				Sandwich sandwich = new Sandwich();
				sandwich.setBread(bread);
				sandwich.setName(name);
				sandwiches.add(sandwich);
			}
			return sandwiches;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
