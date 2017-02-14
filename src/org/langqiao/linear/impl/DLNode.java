package org.langqiao.linear.impl;

import org.langqiao.linear.intf.Node;

/**
 * 双向链表
 * @author YMY
 *
 */
public class DLNode implements Node{
	
	private Object element;
	
	private DLNode pre;
	
	private DLNode next;
	
	public DLNode(){
		this(null,null,null);
	}
	public DLNode(Object ele,DLNode pre,DLNode next){
		this.element = ele;
		this.pre = pre;
		this.next = next;
	}
	
	@Override
	public Object getData() {
		return null;
	}

	@Override
	public void setData(Object obj) {
		
	}
	public DLNode getNext() {
		return next;
	}
	public void setNext(DLNode next) {
		this.next = next;
	}
	public DLNode getPre() {
		return pre;
	}
	public void setPre(DLNode pre) {
		this.pre = pre;
	}
	
}
