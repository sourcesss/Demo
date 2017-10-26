package cn.com.java.study.xiaomm.demo.algorithm;

import junit.framework.TestCase;

public class UglyNumberTest extends TestCase {
	private UglyNumber un;
	protected void setUp(){
		un=new UglyNumber();
	}
	public void testIsUglyNumber() {
		assertEquals(true, un.isUglyNumber(555));
	}
	
}
