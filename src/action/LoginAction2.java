package action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction2 extends ActionSupport{
	private String username;
	private String password;
	
	//不重写方法
	public String execute() throws Exception {
		System.out.println("数据合法........");
		return SUCCESS;
	}
	
	public String execute2(){
		System.out.println("方法333333被执行.....");
		return "success";
	}
	
	//重写的方法是默认校验execute()方法的
	//注意：该方式只对Execute2()方法进行校验，但访问execute()方法可以直接登录，就不会进行校验
	public void validateExecute2() {
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
