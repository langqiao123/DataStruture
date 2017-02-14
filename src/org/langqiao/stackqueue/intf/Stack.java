package org.langqiao.stackqueue.intf;

import org.langqiao.exception.StackEmptyException;

public interface Stack {
	
	//获取栈的大小
	public int getSize();
	//判断栈是否为空
	public boolean isEmpty();
	//入栈
	public void push(Object e);
	//栈顶元素出栈
	public Object pop() throws StackEmptyException;
	//获取栈顶元素
	public Object peek() throws StackEmptyException;
}
