package interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class TimeIntercepter extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation ac) throws Exception {
		long before = System.currentTimeMillis();
		//到达控制器之前要执行的功能
		System.out.println("到达控制器之前的时间为："+before);
		
		//调用控制器中的方法，或者下一个拦截器中的方法
		//cx的作用是做预处理操作，可以获得session，url请求参数等
		ActionContext cx = ac.getInvocationContext();
		Map<String, Object> map = cx.getParameters();
		//map集合放的是请求中携带的参数，
		System.out.println(map);
		
		String result = ac.invoke();
		
		long end = System.currentTimeMillis();
		//离开控制器之后要执行的功能
		System.out.println("到达控制器之前的时间为："+end);
		
		System.out.println("控制器的执行时间："+(end-before));
		return result;
	}

}
