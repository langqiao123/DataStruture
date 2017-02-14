package org.langqiao.stackqueue.impl;

import org.langqiao.exception.QueneEmptyException;
import org.langqiao.exception.StackEmptyException;
import org.langqiao.linear.impl.SLNode;
import org.langqiao.stackqueue.intf.Quene;


/**
 * 
 * 队列的链式存储实现
 * @author YMY
 */
public class QueneSLinked implements Quene{

	private SLNode front;	//队首节点
	private SLNode rear;	//队尾节点
	private int size;	//队列大小
	
	public QueneSLinked(){
		front = new SLNode();
		rear = front;
		size = 0;
	}

	@Override
	public int getSize() {
		String str = null;
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public void enquene(Object e) {
		SLNode p = new SLNode(e, null);
		rear.setNext(p);
		rear = p;
		size ++ ;
	}

	@Override
	public Object dequene() throws QueneEmptyException {
		if(size < 1)
			throw new StackEmptyException("错误，队列为空！");
		SLNode p = front.getNext();
		front.setNext(p.getNext());
		size --;
		if(size < 1)
			rear = front;
		return p.getData();
	}

	@Override
	public Object peek() throws QueneEmptyException {
		if(size < 1)
			throw new StackEmptyException("错误，队列为空！");
		return front.getData();
	}
}
