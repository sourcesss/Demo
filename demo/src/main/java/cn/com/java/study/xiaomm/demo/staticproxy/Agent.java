package cn.com.java.study.xiaomm.demo.staticproxy;

/**
 * 代理商
 * @author xiaomm
 *
 */
public class Agent implements MobileSeller {

	private  Oppo oppo;
	
	
	public Agent(Oppo oppo) {
		super();
		this.oppo = oppo;
	}


	public void sellMobilePhone() {
		beforeSell();
		oppo.sellMobilePhone();
		afterSell();
	}
	
	private void beforeSell() {
		System.out.println("aaaa");
	}

	private void afterSell() {
    	System.out.println("bbbb");
	}
}
