package action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction4 extends ActionSupport{
	private String username;
	private String password;
	
	//框架验证  -----局部验证，对引的xml文件只验证某个方法
	public String execute() throws Exception {
		System.out.println("框架校验。。局部验证。。。数据合法........");
		return SUCCESS;
	}
	
	public String execute2(){
		System.out.println("框架校验。。。。局部验证。。。。。，方法333333被执行.....");
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
