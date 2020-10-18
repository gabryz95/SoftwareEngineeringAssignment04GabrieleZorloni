//AUTHOR: GABRIELE ZORLONI
package model.authentication;

// Class representing the login data entered by a user. 
// It is used to login and to check that the data entered by the user is correct.
public class Login {

	private String username;
	private String password;

	public Login(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
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
}
