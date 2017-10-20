package cn.com.java.study.xiaomm.demo.staticproxy;

public class Consumer {

	public static void main(String[] args) {
		Oppo oppo =new Oppo();
		Agent agent=new Agent(oppo);
		agent.sellMobilePhone();
	}

}
