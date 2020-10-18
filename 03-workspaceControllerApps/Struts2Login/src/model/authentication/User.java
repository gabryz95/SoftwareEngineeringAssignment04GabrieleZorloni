//AUTHOR: GABRIELE ZORLONI
package model.authentication;

// Class representing a user. It is implemented through an abstract class.
public abstract class User {
	
	private String username; 
	private String password;
	private String name;
	private String email; 
	private String city; 
	private String country;
	
	public User(String username, String password, String name, String email, String city, String country) {
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
		this.city = city;
		this.country = country;
	}
	
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
}
