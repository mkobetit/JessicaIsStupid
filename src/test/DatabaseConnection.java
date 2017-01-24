package test;

import java.util.ArrayList;

import database.Selectors;
import objects.User;

public class DatabaseConnection {
	
	
	public ArrayList<User> getBestUser() throws Exception {
		
		return Selectors.getUsers();
	}
	

}
