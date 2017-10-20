package cn.com.java.study.xiaomm.demo.linkedlist;

import java.util.Iterator;

public class LinkedList<T> implements Iterator<T>{
	private Node<T> head;
	public LinkedList(){
		head=new Node<T>(null);
	}
	public void add(T t) {
		Node<T> temp=head;
		while(temp.nextNode!=null) {
			temp=temp.nextNode;
		}
		Node<T> nextNode=new Node<T>(t);
		temp.setNextNode(nextNode);
	}
	
	public T get(int i) {
		Node<T> temp=head;
		int size=0;
		while(temp.nextNode!=null) {
			temp=temp.nextNode;
			if(size==i) {
				break;
			}
			size++;
		}
		if(size<i) {
			try {
				throw new Exception("数组越界");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return temp.getValue();
	}
	public T set(int i,T t) {
		Node<T> temp=head;
		int size=0;
		while(temp.nextNode!=null) {
			temp=temp.nextNode;
			if(size==i) {
				break;
			}
			size++;
		}
		if(size<i) {
			return null;
		}
		Node<T> imp=temp;
		temp.setValue(t);
		return imp.getValue();
	}
	public void print() {
		Node<T> temp=head;
		StringBuilder sb=new StringBuilder();
		while(temp.nextNode!=null) {
			temp=temp.nextNode;
			sb.append(temp.getValue().toString()).append(",");
		}
		System.out.println(sb.toString());
	}
	public int size() {
		int size=0;
		Node<T> temp=head;
		while(temp.nextNode!=null) {
			temp=temp.nextNode;
			size++;
		}
		return size;
	}

	class Node<T>{
		private T  value;
		private Node<T> nextNode;
		
		public Node(T value) {
			super();
			this.value = value;
		}
		public T getValue() {
			return value;
		}
		public void setValue(T value) {
			this.value = value;
		}
		public Node<T> getNextNode() {
			return nextNode;
		}
		public void setNextNode(Node<T> nextNode) {
			this.nextNode = nextNode;
		}
		
	}

	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}
	public T next() {
		// TODO Auto-generated method stub
		return null;
	}
}
