//AUTHOR: GABRIELE ZORLONI
package actions.authentication;

import com.opensymphony.xwork2.ActionSupport;

import actions.controller.ActionController;
import model.authentication.Login;
import model.authentication.User;

// Class that allows us to perform the login action.
public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private final ActionController controller = ActionController.getInstance();

	// Data coming from the form, automatically injected by STRUTS
	private String username;
	private String password;
	private User user;

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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	// Method that allows a user to login. If the login data is correct, 
	// the web page containing the logged-in user's data will be displayed, 
	// otherwise an error message will appear on the login page
	public String execute() {
		if (controller.checkLogin(new Login(username, password))) {
			setUser(controller.getUserByUsernameAndPassword(username, password));
			return "success";
		} else {
			addActionError(getText("error.login"));
			return "error";
		}
	}
}
