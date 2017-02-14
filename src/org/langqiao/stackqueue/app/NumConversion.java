package org.langqiao.stackqueue.app;

import org.langqiao.stackqueue.impl.StackSLinked;
import org.langqiao.stackqueue.intf.Stack;

public class NumConversion {
	
	public void baseConversion(int i){
		Stack s = new StackSLinked();
		while(i > 0){
			s.push(i%8 + "");
			i = i / 8;
		}
		while (!s.isEmpty()) {
			System.out.print((String)s.pop());
		};
	}
	
	public static void main(String[] args) {
		NumConversion nc = new NumConversion();
		nc.baseConversion(2007);
	}
}
