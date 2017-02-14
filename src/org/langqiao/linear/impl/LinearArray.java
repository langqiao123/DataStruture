package org.langqiao.linear.impl;

import org.langqiao.linear.intf.List;

/**
 * 
 * 线性表顺序存储数组实现
 * @author YMY
 */
public class LinearArray implements List{
	private final int LEN = 8;//数组大小默认为8
	//private Strategy strategy;	//数据元素的比较策略
	private int size;	//线性表的大小
	private Object[] elements;	//数据元素数组
	
	public LinearArray(){
		size = 0;
		elements = new Object[LEN];
	}
	
	public int size() {
		return size;
	}
	@Override
	public boolean isEmpty() {
		return size == 0;
	}
	@Override
	public boolean contains(Object o) {
		for(int i=0;i<size;i++){
			if(o.equals(elements[i]))
				return true;
		}
		return false;
	}
	@Override
	public int indexOf(Object o) {
		for(int i=0;i<size;i++){
			if(o.equals(elements[i]))
				return i;
		}
		return -1;
	}
	@Override
	public void insert(int i,Object e)throws ArrayIndexOutOfBoundsException{
		if(i<0 || i>size){
			throw new ArrayIndexOutOfBoundsException("错误，指定的插入序号越界");
		}
		if(size> elements.length){
			explandSpace();
		}
		for(int j=size;j>i;j--){
			elements[j] = elements[j-1];
		}
		elements[i] = e;
		size ++;
		return;
	}
	
	public void explandSpace(){
		Object[] a = new Object[elements.length*2];
		//Arrays.copyOf(elements, a.length);
		for(int i=0;i<elements.length;i++){
			a[i] = elements[i];
		}
		elements = a;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public boolean insertBefore(Object obj, Object e) {
		int i = indexOf(obj);
		if(i<0)
			return false;
		insert(i, e);
		return true;
	}

	@Override
	public boolean insertAfter(Object obj, Object e) {
		int i = indexOf(obj);
		if(i<0)
			return false;
		insert(i+1, e);
		return false;
	}

	@Override
	public Object remove(int i) {
		if(i<0 || i>=size){
			throw new ArrayIndexOutOfBoundsException("错误，指定序号越界");
		}
		Object obj = elements[i];
		for(int j=i;j<size;j++){
			elements[j] = elements[j+1];
		}
		elements[size--] = null;
		return obj;
	}

	@Override
	public boolean remove(Object e) {
		int i = indexOf(e);
		if(i<0)
			return false;
		remove(i);
		return true;
	}

	@Override
	public Object replace(int i, Object e) {
		if(i<0 || i>=size){
			throw new ArrayIndexOutOfBoundsException("错误，指定序号越界");
		}
		Object obj = elements[i];
		elements[i] = e;
		return obj;
	}

	@Override
	public Object get(int i) {
		if(i<0 || i>=size){
			throw new ArrayIndexOutOfBoundsException("错误，指定序号越界");
		}
		return elements[i];
	}
}
