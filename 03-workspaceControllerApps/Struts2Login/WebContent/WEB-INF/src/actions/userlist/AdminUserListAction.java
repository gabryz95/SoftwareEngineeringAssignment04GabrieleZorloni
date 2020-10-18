//AUTHOR: GABRIELE ZORLONI
package actions.userlist;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import actions.controller.ActionController;
import model.authentication.User;

// Class that allows us to perform the admin user list action.
public class AdminUserListAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private List<User> adminList = ActionController.getInstance().getAdminList();

	public List<User> getAdminList() {
		return adminList;
	}

	public void setAdminList(List<User> adminList) {
		this.adminList = adminList;
	}

	// Method that allows us to display the admin user list.
	public String execute() {
		if (adminList.size() > 0)
			return "success";
		else {
			addActionError(getText("error.userlist"));
			return "error";
		}
	}
}
