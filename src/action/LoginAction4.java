package action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction4 extends ActionSupport{
	private String username;
	private String password;
	
	//�����֤  -----�ֲ���֤��������xml�ļ�ֻ��֤ĳ������
	public String execute() throws Exception {
		System.out.println("���У�顣���ֲ���֤���������ݺϷ�........");
		return SUCCESS;
	}
	
	public String execute2(){
		System.out.println("���У�顣�������ֲ���֤����������������333333��ִ��.....");
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
