package action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction2 extends ActionSupport{
	private String username;
	private String password;
	
	//����д����
	public String execute() throws Exception {
		System.out.println("���ݺϷ�........");
		return SUCCESS;
	}
	
	public String execute2(){
		System.out.println("����333333��ִ��.....");
		return "success";
	}
	
	//��д�ķ�����Ĭ��У��execute()������
	//ע�⣺�÷�ʽֻ��Execute2()��������У�飬������execute()��������ֱ�ӵ�¼���Ͳ������У��
	public void validateExecute2() {
		if(username==null || "".equals(username)){
			System.out.println("�û�������Ϊ��"); 
			addFieldError("username", "�û�������Ϊ��");
		}else if(password==null || "".equals(password)){
			System.out.println("���벻��Ϊ��");
			this.addFieldError("password", "���벻��Ϊ��");
			
		}else{
			System.out.println("У��ͨ��");
		}
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
