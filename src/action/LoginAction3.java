package action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction3 extends ActionSupport{
	private String username;
	private String password;
	
	//����д����
	public String execute() throws Exception {
		System.out.println("xml��ʽУ�顣�����������ݺϷ�........");
		return SUCCESS;
	}
	
	public String execute2(){
		System.out.println("xml��ʽУ�飬����333333��ִ��.....");
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
