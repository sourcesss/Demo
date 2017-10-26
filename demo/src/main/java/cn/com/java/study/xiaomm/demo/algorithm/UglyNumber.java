package cn.com.java.study.xiaomm.demo.algorithm;

public class UglyNumber {

	public  boolean isUglyNumber(int value) {
		int a=value%2;
		int b=value%3;
		int c=value%5;
		if(a!=0&&b!=0&&c!=0) {
			return false;
		}
		int d=0;
		if(a==0) d=value/2;
		if(b==0) d=value/3;
		if(c==0) d=value/5;
		if(d==2||d==3||d==5) {
			return true;
		}else {
			return this.isUglyNumber(d);
		}
	}
}
