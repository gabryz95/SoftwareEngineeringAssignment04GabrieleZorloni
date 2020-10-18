//AUTHOR: GABRIELE ZORLONI
package actions.registration;

import com.opensymphony.xwork2.ActionSupport;

import actions.controller.ActionController;
import model.authentication.NormalUser;
import model.authentication.User;

// Class that allows us to perform the registration action.
public class RegistrationAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private final ActionController controller = ActionController.getInstance();

	private String username;
	private String password;
	private String name;
	private String email;
	private String city;
	private String country;

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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	// Method that allows us to register a new user. 
	// It checks that all the required values are inserted and 
	// that no user with the same username is present, 
	// otherwise an error message will appear on the registration page.
	public String execute() {
		User newUser = new NormalUser(username, password, name, email, city, country);
		if (controller.chechUserInput(newUser)) {
			if (controller.checkUser(newUser)) {
				addActionError(getText("error.dup"));
				return "error";
			} else {
				controller.addUser(newUser);
				return "success";
			}
		} else {
			addActionError(getText("error.reg"));
			return "error";
		}
	}
}
