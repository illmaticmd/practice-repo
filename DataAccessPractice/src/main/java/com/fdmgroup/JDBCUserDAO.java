package com.fdmgroup;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import oracle.jdbc.OracleDriver;

public class JDBCUserDAO implements UserDAO {
	private Properties props;

	public JDBCUserDAO() throws FileNotFoundException, IOException, SQLException {
		props = new Properties();
		props.load(new FileInputStream(new File("src/main/resources/db.properties")));
		DriverManager.registerDriver(new OracleDriver());
	}

	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(props.getProperty("url"), props);
	}

	@Override
	public List<User> listUsers() {
		try (Connection conn = getConnection()) {
			Statement statement = conn.createStatement();
			String query = "SELECT user_id, username, user_password, first_name, last_name, email,user_role, status_in FROM users";
			ResultSet rs = statement.executeQuery(query);
			List<User> users = new ArrayList<>();
			while (rs.next()) {
				long id = rs.getLong("user_id");
				String username = rs.getString("username");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				String password = rs.getString("user_password");
				String email = rs.getString("email");
				String role = rs.getString("user_role");
				int status = rs.getInt("status_in");
				if (rs.wasNull()) {
					status = 1;
				}
				User user = new User(username, password, firstName, lastName, email, Role.valueOf(role), status);
				user.setId(id);
				users.add(user);
			}
			return users;
		} catch (SQLException e) {
		}
		return null;
	}

	@Override
	public void addUser(User user) {
		try (Connection conn = getConnection()) {
			String query = "{call ADD_USER(?,?,?,?,?,?,?,?)}";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setLong(1, user.getId());
			ps.setString(2, user.getUsername());
			ps.setString(3, user.getPassword());
			ps.setString(4, user.getFirstName());
			ps.setString(5, user.getLastName());
			ps.setString(6, user.getEmail());
			ps.setString(7, user.getRole().toString());
			ps.setInt(8, user.getStatus());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public User getUser(String username) {
		try (Connection conn = getConnection()) {

			String query = "SELECT user_id,  user_password, first_name, last_name, email,user_role, status_in FROM users WHERE username=?";
			PreparedStatement statement = conn.prepareStatement(query);
			statement.setString(1, username);
			ResultSet rs = statement.executeQuery();
			rs.next();
			
			long id = rs.getInt("user_id");
			String firstName = rs.getString("first_name");
			String lastName = rs.getString("last_name");
			String password = rs.getString("user_password");
			String email = rs.getString("email");
			String role = rs.getString("user_role");
			int status = rs.getInt("status_in");
			if (rs.wasNull()) {
				status = 1;
			}
			User user = new User(username, password, firstName, lastName, email, Role.valueOf(role), status);
			user.setId(id);
			return user;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void removeUser(String username) {
		try (Connection conn = getConnection()) {
			String query = "DELETE FROM users WHERE username=?";
			PreparedStatement statement = conn.prepareStatement(query);
			statement.setString(1, username);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateUser(User user) {
		try (Connection conn = getConnection()) {
			String query = "{call UPDATE_USER(?,?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(query);		
			ps.setString(1, user.getPassword());
			ps.setString(2, user.getFirstName());
			ps.setString(3, user.getLastName());
			ps.setString(4, user.getEmail());
			ps.setString(5, user.getRole().toString());
			ps.setInt(6, user.getStatus());
			ps.setString(7, user.getUsername());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
