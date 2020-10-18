//AUTHOR: GABRIELE ZORLONI
package model.authentication;

// Class representing an admin. It extends the abstract class User.
public class Admin extends User {

	public Admin(String username, String password, String name, String email, String city, String country) {
		super(username, password, name, email, city, country);
	}

}
