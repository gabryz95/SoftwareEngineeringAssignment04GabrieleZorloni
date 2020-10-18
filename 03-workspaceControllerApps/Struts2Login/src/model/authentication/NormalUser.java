//AUTHOR: GABRIELE ZORLONI
package model.authentication;

//Class representing a normal user. It extends the abstract class User.
public class NormalUser extends User {

	public NormalUser(String username, String password, String name, String email, String city, String country) {
		super(username, password, name, email, city, country);
	}
}
