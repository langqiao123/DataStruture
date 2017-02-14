package org.langqiao.stackqueue.impl;

import org.langqiao.exception.StackEmptyException;
import org.langqiao.stackqueue.intf.Stack;

/**
 * 栈的顺序存储实现
 * @author YMY
 *
 */
public class StackArray implements Stack{

	private final int LEN = 8;//栈初始大小
	private Object[] elements;	//数据元素数组
	private int top;	//栈顶指针
	
	public StackArray(){
		top = -1;
		elements = new Object[LEN];
	}
	
	@Override
	public int getSize() {
		return top + 1;
	}

	@Override
	public boolean isEmpty() {
		return top < 0;
	}

	@Override
	public void push(Object e) {
		if(getSize() > elements.length){
			explandSpace();
		}
		//elements[top++]=e，是现将elements[]赋值，top在自加
		//先将top进行自加，在将elements[]进行赋值
		elements[++top] = e;
	}

	public void explandSpace(){
		Object[] a = new Object[elements.length*2];
		for(int i=0;i<elements.length;i++){
			a[i] = elements[i];
		}
		elements = a;
	}
	
	@Override
	public Object pop() throws StackEmptyException {
		if(getSize() < 1)
			throw new StackEmptyException("错误，堆栈为空！");
		Object obj = elements[top];
		elements[top--] = null;
		return obj;
	}

	@Override
	public Object peek() throws StackEmptyException {
		if(getSize() < 1)
			throw new StackEmptyException("错误，堆栈为空！");
		return elements[top];
	}
	
	public static void main(String[] args) throws Exception {        
	      StackArray stack=new StackArray();        
	      stack.push(new String("1"));        
	      stack.push(new String("2"));        
	      stack.push(new String("3"));        
	      stack.push(new String("4"));        
	      stack.push(new String("5"));    
	      System.out.println(stack.peek());   
	              
	      while(stack.top >= 0)  {        
	          System.out.println(stack.pop());        
	      }              
	  }       
}
