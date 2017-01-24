package webservice;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.google.gson.Gson;

import database.Selectors;
import objects.User;
import java.util.ArrayList;

@Path("User")
public class UserWS {
	
@Path("getUsers")
@POST
@Produces("application/json")
public String getUsers() throws Exception {
	Gson gson = new Gson();
	
	ArrayList<User> users = new ArrayList<User>();
	
	users = Selectors.getUsers();
	String usersJson = gson.toJson(users);	
	
		return usersJson;
	}



@Path("getUsersByGender")
@POST
@Produces("application/json")
public String getUsersByGender(String gender) throws Exception {
		Gson gson = new Gson();
		
		ArrayList<User> users = new ArrayList<User>();
		
		users = Selectors.getUsers(gender);
		String usersJson = gson.toJson(users);
		
		return usersJson;
	}

@Path("getUsersByLastName")
@POST
@Produces("application/json")
public String getUsersByLastName(String lastName) throws Exception {
		Gson gson = new Gson();
		
		ArrayList<User> users = new ArrayList<User>();
		
		users = Selectors.getUsersByLastName(lastName);
		String usersJson = gson.toJson(users);
		
		return usersJson;
	}

}


