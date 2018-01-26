package action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction3 extends ActionSupport{
	private String username;
	private String password;
	
	//不重写方法
	public String execute() throws Exception {
		System.out.println("xml方式校验。。。。。数据合法........");
		return SUCCESS;
	}
	
	public String execute2(){
		System.out.println("xml方式校验，方法333333被执行.....");
		return "success";
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
