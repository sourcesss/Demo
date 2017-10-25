package cn.com.java.study.xiaomm.demo.dynamicproxy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;

import sun.misc.ProxyGenerator;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		RealSubject rsb=new RealSubject();
		Subject sb=(Subject)Proxy.newProxyInstance(Subject.class.getClassLoader(), new Class[] {Subject.class}, new ProxyHandler(rsb));
		sb.doSomething();
		byte[] a=ProxyGenerator.generateProxyClass(
"$Proxy0", new Class[] {Subject.class},  Modifier.PUBLIC | Modifier.FINAL);
		FileOutputStream fos=new FileOutputStream(new File("D:\\$Proxy0.class"));
		try {
			fos.write(a);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
