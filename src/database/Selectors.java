package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import objects.User;

public class Selectors {
	
	public Selectors() {};
	
	public static ArrayList<User> getUsers() throws Exception {
		
		ArrayList<User> users = new ArrayList<User>();
		Connection con = Util.getConnection(Datasources.dbsys1);
		
		try {
			
			PreparedStatement stmt = con.prepareStatement(Queries.getUsers);
			
			ResultSet results = stmt.executeQuery();
			
			while(results.next()) {
				User user = new User();
				user.setFirstName(results.getString("first_name"));
				user.setMiddleName(results.getString("middle_name"));
				user.setLastName(results.getString("last_name"));
				user.setEmailAddress(results.getString("email_address"));
				user.setPhoneNumber(results.getString("phone_number"));
				user.setGender(results.getString("gender"));
				user.setId(results.getInt("user_id"));
				user.setCompanyName(results.getString("company_name"));
				user.setJobTitle(results.getString("job_title"));
				user.setSalary(results.getDouble("salary"));				
				
				users.add(user);
			}
		}
		catch(Exception e) {
			throw e;
		}
		
		finally{
			con.close();
		}
		
		return users;
		
	}
	
	
public static ArrayList<User> getUsers(String gender) throws Exception {
		
		ArrayList<User> users = new ArrayList<User>();
		Connection con = Util.getConnection(Datasources.dbsys1);
		try {
			
			PreparedStatement stmt = con.prepareStatement(Queries.getUsersByGender);
			stmt.setString(1, gender);
			
			ResultSet results = stmt.executeQuery();
			
			while(results.next()) {
				User user = new User();
				user.setFirstName(results.getString("first_name"));
				user.setLastName(results.getString("last_name"));
				user.setEmailAddress(results.getString("email_address"));
				user.setPhoneNumber(results.getString("phone_number"));
				user.setGender(results.getString("gender"));
				user.setMiddleName(results.getString("middle_name"));
				user.setId(results.getInt("user_id"));
				user.setCompanyName(results.getString("company_name"));
				user.setJobTitle(results.getString("job_title"));
				user.setSalary(results.getDouble("salary"));
				
				users.add(user);
			}
		}
		catch(Exception e) {
			throw e;
		}
		
		finally{
			con.close();
		}
		
		return users;
		
	}

public static ArrayList<User> getUsersByLastName(String lastName) throws Exception {
	
	ArrayList<User> users = new ArrayList<User>();
	Connection con = Util.getConnection(Datasources.dbsys1);
	try {
		PreparedStatement stmt = con.prepareStatement(Queries.getUsersByLastName);
		stmt.setString(1, lastName);
		
		ResultSet results = stmt.executeQuery();
		
		while(results.next()) {
			User user = new User();
			user.setFirstName(results.getString("first_name"));
			user.setLastName(results.getString("last_name"));
			user.setEmailAddress(results.getString("email_address"));
			user.setPhoneNumber(results.getString("phone_number"));
			user.setGender(results.getString("gender"));
			user.setMiddleName(results.getString("middle_name"));
			user.setId(results.getInt("user_id"));
			user.setCompanyName(results.getString("company_name"));
			user.setJobTitle(results.getString("job_title"));
			user.setSalary(results.getDouble("salary"));
			
			users.add(user);
		}
	}
	catch(Exception e) {
		throw e;
	}
	finally{
		con.close();
	}
	
	return users;
	
}
}
