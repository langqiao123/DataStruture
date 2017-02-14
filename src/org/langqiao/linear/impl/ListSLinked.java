package org.langqiao.linear.impl;

import org.langqiao.linear.intf.List;


/**
 * 
 * 线性表单链表存储数组实现
 * @author YMY
 */
public class ListSLinked implements List{
	
	private SLNode head;	//单链表头结点引用
	private int size;	//线性表中数据元素的个数
	
	public ListSLinked(){
		head = new SLNode();
		size = 0;
	}
	
	//获取数据元素e所在结点的前驱结点
	private SLNode getPreNode(Object e){
		SLNode p = head;
		while (p.getNext() != null) {
			if(p.getData().equals(e)){
				return p;
			}else {
				p = p.getNext();
			}
		}
		return null;
	}
	
	//获取指定位置i所在结点的前驱结点
	private SLNode getPreNode(int i){
		SLNode p = head;
		for(;i>0;i--){
			p = p.getNext();
		}
		return p;
	}
	
	//获取指定位置i所在的结点
	private SLNode getNode(int i){
		SLNode p = head.getNext();
		for(;i>0;i--){
			p = p.getNext();
		}
		return p;
	}
	@Override
	public int getSize() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public boolean contains(Object o) {
		SLNode p = head.getNext();
		while (p != null) {
			if(p.getData().equals(o)){
				return true;
			}else{
				p = p.getNext();
			}
		}
		return false;
	}

	@Override
	public int indexOf(Object o) {
		SLNode p = head.getNext();
		int index = 0;
		while (p != null) {
			if(p.getData().equals(o)){
				return index;
			}else{
				index ++;
				p = p.getNext();
			}
		}
		return -1;
	}

	@Override
	public void insert(int i, Object e) throws ArrayIndexOutOfBoundsException {
		if(i<0 || i>size){
			throw new ArrayIndexOutOfBoundsException("错误，指定序号越界");
		}
		//获得指定位置的前驱结点
		SLNode p = getPreNode(i);
		//将结点p的后继结点的前驱指向给新插入的结点
		SLNode q = new SLNode(e, p.getNext());
		p.setNext(q);
		size++;
		return;
	}
	
	//将元素e插入到obj之前
	public boolean insertBefore(Object obj, Object e) {
		//获得指定位置的前驱结点
		SLNode p = getPreNode(obj);
		if(p != null){
			//将结点p的后继结点的前驱指向给新插入的结点
			SLNode q = new SLNode(e, p.getNext());
			p.setNext(q);
			size++;
			return true;
		}
		return false;
	}
	
	//将元素e插入到obj之后
	public boolean insertAfter(Object obj, Object e) {
		//获得指定位置的前驱结点
		SLNode p = head.getNext();
		while(p != null){
			if(p.getData().equals(obj)){
				//将结点p的后继结点的前驱指向给新插入的结点
				SLNode q = new SLNode(e, p.getNext());
				p.setNext(q);
				size++;
				return true;
				
			}else{
				p = p.getNext();
			}
		}
		return false;
	}
	
	//删除线性表中位置为i的元素，并返回之
	public Object remove(int i) {
		//获得指定位置的前驱结点
		if(i<0 || i>=size){
			throw new ArrayIndexOutOfBoundsException("错误，指定序号越界");
		}
		SLNode p = getPreNode(i);
		Object obj = p.getNext().getData();
		p.setNext(p.getNext().getNext());
		size --;
		return obj;
	}
	
	//删除线性表中第一个与e相同的元素
	public boolean remove(Object e) {
		SLNode p = getPreNode(e);
		while(p != null){
			p.setNext(p.getNext().getNext());
			size--;
			return true;
		}
		return false;
	}

	@Override
	public Object replace(int i, Object e) {
		if(i<0 || i>=size){
			throw new ArrayIndexOutOfBoundsException("错误，指定序号越界");
		}
		SLNode p = getNode(i);
		Object obj = p.getData();
		p.setData(e);
		return obj;
	}

	@Override
	public Object get(int i) {
		if(i<0 || i>=size){
			throw new ArrayIndexOutOfBoundsException("错误，指定序号越界");
		}
		SLNode p = getNode(i);
		Object obj = p.getData();
		return obj;
	}
	
}
