package org.langqiao.stackqueue.intf;

import org.langqiao.exception.QueneEmptyException;

public interface Quene {
	
	//获取队列的大小
	public int getSize();
	//判断队列是否为空
	public boolean isEmpty();
	//入队
	public void enquene(Object e);
	//出队
	public Object dequene() throws QueneEmptyException;
	//获取队首元素
	public Object peek() throws QueneEmptyException;
}
