package action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private String username;
	private String password;
	
	@Override
	public String execute() throws Exception {
		/*if(username==null || "".equals(username)){
			return LOGIN; 
		}else if(password==null || "".equals(password)){
			return LOGIN; 
		}else{
			System.out.println("���ݺϷ�.......");
		}*/
		System.out.println("���ݺϷ�........");
		return SUCCESS;
	}
	
	//��ʽһ��У���Լ�д�ķ�������Ҫ��xml�ļ������µ�action��method����
	public String execute2(){
		System.out.println("����2��ִ��.....");
		return "success";
	}
	
	
	
	@Override
	/*
	 * 1.addActionError�ǿ����������������߼����󣬽������ݿ⣬�û��������������
	 * 2.addFieldError�����Դ������ݷǷ������û�������ǿմ���
	 * 3.ע�⣺Ĭ�Ϸ��ص���input��ͼ
	 */
	public void validate() {
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
