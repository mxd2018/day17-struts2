package interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class TimeIntercepter4 extends MethodFilterInterceptor{

	@Override
	protected String doIntercept(ActionInvocation ac) throws Exception {
		System.out.println("MethodFilterInterceptor±»Ö´ÐÐ.....");
		String result = ac.invoke();
		return result;
	}

	
}
