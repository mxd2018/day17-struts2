package action;

import com.opensymphony.xwork2.ActionSupport;

public class TimeIntercepterAction01 extends ActionSupport{
	
	@Override
	public String execute() throws Exception {
		Thread.sleep(5000);
		
		System.out.println("控制器被执行....."); 	
		return SUCCESS;
	}
	
	public String doBiz(){
		System.out.println("doBiz方法被执行.....");
		return SUCCESS;
	}
	
}
