package cn.com.java.study.xiaomm.demo.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler {
	
	private RealSubject sb;

	public ProxyHandler(RealSubject sb) {
		super();
		this.sb = sb;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("before doing something");
		return method.invoke(sb, args);
	}

}
