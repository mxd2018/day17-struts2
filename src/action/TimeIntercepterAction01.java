package action;

import com.opensymphony.xwork2.ActionSupport;

public class TimeIntercepterAction01 extends ActionSupport{
	
	@Override
	public String execute() throws Exception {
		Thread.sleep(5000);
		
		System.out.println("��������ִ��....."); 	
		return SUCCESS;
	}
	
	public String doBiz(){
		System.out.println("doBiz������ִ��.....");
		return SUCCESS;
	}
	
}
