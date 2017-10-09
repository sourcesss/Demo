package cn.com.java.study.xiaomm.demo.staticProxy;

public class Consumer {

	public static void main(String[] args) throws ClassNotFoundException {
		Oppo oppo =new Oppo();
		Agent agent=new Agent(oppo);
		agent.sellMobilePhone();
	}

}
