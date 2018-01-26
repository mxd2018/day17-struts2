package interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class TimeIntercepter extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation ac) throws Exception {
		long before = System.currentTimeMillis();
		//���������֮ǰҪִ�еĹ���
		System.out.println("���������֮ǰ��ʱ��Ϊ��"+before);
		
		//���ÿ������еķ�����������һ���������еķ���
		//cx����������Ԥ������������Ի��session��url���������
		ActionContext cx = ac.getInvocationContext();
		Map<String, Object> map = cx.getParameters();
		//map���Ϸŵ���������Я���Ĳ�����
		System.out.println(map);
		
		String result = ac.invoke();
		
		long end = System.currentTimeMillis();
		//�뿪������֮��Ҫִ�еĹ���
		System.out.println("���������֮ǰ��ʱ��Ϊ��"+end);
		
		System.out.println("��������ִ��ʱ�䣺"+(end-before));
		return result;
	}

}
