package com.FCI.SWE.Services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.server.mvc.Viewable;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.FCI.SWE.Models.UserEntity;

/**
 * This class contains REST services, also contains action function for web
 * application
 * 
 * @author Mohamed Samir
 * @version 1.0
 * @since 2014-02-12
 *
 */
@Path("/")
@Produces("text/html")
public class Service {
	
	
	/*@GET
	@Path("/index")
	public Response index() {
		return Response.ok(new Viewable("/jsp/entryPoint")).build();
	}*/


		/**
	 * Registration Rest service, this service will be called to make
	 * registration. This function will store user data in data store
	 * 
	 * @param uname
	 *            provided user name
	 * @param email
	 *            provided user email
	 * @param pass
	 *            provided password
	 * @return Status json
	 */
	@POST
	@Path("/RegistrationService")
	public String registrationService(@FormParam("uname") String uname,
			@FormParam("email") String email, @FormParam("password") String pass) {
		UserEntity user = new UserEntity(uname, email, pass);// hena bb3thm 
		user.saveUser();//lclass userentity fi constructot and put them in save user
		JSONObject object = new JSONObject();
		object.put("Status", "OK");
		return object.toString();
	}
	/**
	 * add friend Rest service, this service will be called to send 
	 * .friend request This function will store user data in data store
	 * 
	 * @param uname
	 *            provided user name
	 * @param email
	 *            provided user email
	 * @param pass
	 *            provided password
	 * @return Status json
	 */
	
	@POST
	@Path("/addService")
	public String registrationService(@FormParam("uname") String uname,
			@FormParam("name1") String name1) {
		UserEntity user = new UserEntity(uname,name1);// hena bb3thm 
		user.addfriend();//lclass userentity fi constructot and put them in save user
		JSONObject object = new JSONObject();
		object.put("Status", "OK");
		return object.toString();
	}

	/**
	 * Login Rest Service, this service will be called to make login process
	 * also will check user name and returns his name from datastore
	 * @param uname provided user name
	 * @return user in json format
	 * search if his name is existed or no if existed will pass you to his
	 * home page
	 * else no
	 */
	@POST
	@Path("/searchService")
	public String searchService(@FormParam("uname") String uname) {
		JSONObject object = new JSONObject();
		UserEntity user = UserEntity.getsearch(uname);
		if (user == null) {
			object.put("Status", "Failed");

		} else {
			object.put("Status", "OK");
			object.put("name", user.getName());
			object.put("email", user.getEmail());
			object.put("password", user.getPass());
			object.put("name", user.getName());
		}

		return object.toString();

	}
	/**
	 * accept friend request to be afriend Rest Service,
	 * this service will take your name and the name of the 
	 * person who want to be afriend of you
	 * also check the two names in the data store
	 * @param uname provided user name
	 * @return user in json format
	 * 
	 * 
	 */
	@POST
	@Path("/AcceptService")
	public String AcceptService(@FormParam("uname") String uname , @FormParam("fname") String fname) {
		JSONObject object = new JSONObject();
		UserEntity user = new UserEntity( uname,fname);
				user.AcceptFriend( );
		
		
		if (user == null) {
			object.put("Status", "Failed");

		} else {
			object.put("Status", "OK");
			object.put("name", user.getName());
			object.put("email", user.getEmail());
			object.put("password", user.getPass());
		}
		return object.toString();

	}

///}
//di bta8d mn user controll  w check user entity
	/**
	 * take the name and the password and sent to jason object
	 * and check the name and the password in the data store
	 * if they existed in the data store will go to your home page
	 */
	@POST
	@Path("/LoginService")
	public String loginService(@FormParam("uname") String uname,
			@FormParam("password") String pass) {
		JSONObject object = new JSONObject();
		UserEntity user = UserEntity.getUser(uname, pass);
		if (user == null) {
			object.put("Status", "Failed");

		} else {
			object.put("Status", "OK");
			object.put("name", user.getName());
			object.put("email", user.getEmail());
			object.put("password", user.getPass());
		}

		return object.toString();

	}
	
}
