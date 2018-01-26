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
			System.out.println("数据合法.......");
		}*/
		System.out.println("数据合法........");
		return SUCCESS;
	}
	
	//方式一：校验自己写的方法，需要再xml文件设置新的action加method属性
	public String execute2(){
		System.out.println("方法2被执行.....");
		return "success";
	}
	
	
	
	@Override
	/*
	 * 1.addActionError是控制器错误：如数据逻辑错误，交互数据库，用户名密码输入错误
	 * 2.addFieldError是属性错误：数据非法，如用户名密码非空错误
	 * 3.注意：默认返回的是input视图
	 */
	public void validate() {
		if(username==null || "".equals(username)){
			System.out.println("用户名不能为空"); 
			addFieldError("username", "用户名不能为空");
		}else if(password==null || "".equals(password)){
			System.out.println("密码不能为空");
			this.addFieldError("password", "密码不能为空");
			
		}else{
			System.out.println("校验通过");
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
