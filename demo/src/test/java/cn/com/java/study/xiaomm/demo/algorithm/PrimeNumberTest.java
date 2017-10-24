package cn.com.java.study.xiaomm.demo.algorithm;

import junit.framework.TestCase;

public class PrimeNumberTest extends TestCase {
	private int[] arr;
	@Override  
    protected void setUp() throws Exception {  
        super.setUp();  
        arr=new int[] {
    			1,2,3,4,5,6,7,101,5,9	
    		}; 
    }  
	
	public void testGetSmallestPrimeNumber() {
		PrimeNumber pn=new PrimeNumber(arr);
		assertEquals(103, pn.getSmallestPrimeNumber());
	}
}
