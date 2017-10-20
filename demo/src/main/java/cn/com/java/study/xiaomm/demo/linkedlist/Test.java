package cn.com.java.study.xiaomm.demo.linkedlist;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list.get(3));
		list.print();
		list.set(2, 7);
		list.print();
	}

}
