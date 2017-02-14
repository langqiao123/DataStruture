package org.langqiao.stackqueue.impl;

import org.langqiao.exception.QueneEmptyException;
import org.langqiao.exception.StackEmptyException;
import org.langqiao.stackqueue.intf.Quene;

/**
 * 队列的顺序存储实现
 * @author YMY
 *
 */
public class QueneArray implements Quene{

	private static final int CAP = 7;//队列初始大小
	private Object[] elements;	//数据元素数组
	private int capacity;	//数组的大小
	private int front;	//队首指针
	private int rear;	//队尾指针
	
	public QueneArray(){
		this(CAP);
	}
	
	public QueneArray(int cap) {
		capacity = cap +1;
		elements = new Object[capacity];
		front = rear =0;
	}

	@Override
	public int getSize() {
		return (rear - front + capacity) % capacity;
	}

	@Override
	public boolean isEmpty() {
		return front == rear;
	}

	@Override
	public void enquene(Object e) {
		if(getSize() == (capacity - 1))
			explandSpace();
		elements[rear] = e;
		front = (front + 1) % capacity;
	}

	public void explandSpace(){
		Object[] a = new Object[elements.length*2];
		int i = 0 , j=0;
		while (i != rear) {
			a[j++] = a[i];
			i = (i + 1 ) % capacity;
		}
		front = 0;
		rear = j;
		capacity = a.length;
		elements = a;
	}
	
	@Override
	public Object dequene() throws QueneEmptyException {
		if(isEmpty())
			throw new StackEmptyException("错误，堆栈为空！");
		Object obj = elements[front];
		elements[front] = null;
		front = (front +1) % capacity;
		return obj;
	}
	      
	@Override
	public Object peek() throws QueneEmptyException {
		if(getSize() < 1)
			throw new StackEmptyException("错误，队列为空！");
		return elements[front];
	}
	
}
