//AUTHOR: GABRIELE ZORLONI
package actions.userlist;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import actions.controller.ActionController;
import model.authentication.User;

// Class that allows us to perform the normal user list action.
public class NormalUserListAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private List<User> normalUserList = ActionController.getInstance().getNormalUserList();

	public List<User> getNormalUserList() {
		return normalUserList;
	}

	public void setNormalUserList(List<User> normalUserList) {
		this.normalUserList = normalUserList;
	}

	// Method that allows us to display the normal user list.
	public String execute() {
		if (normalUserList.size() > 0)
			return "success";
		else {
			addActionError(getText("error.normalUserlist"));
			return "error";
		}
	}
}
