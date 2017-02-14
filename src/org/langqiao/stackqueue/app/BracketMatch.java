package org.langqiao.stackqueue.app;


import org.langqiao.stackqueue.impl.StackSLinked;
import org.langqiao.stackqueue.intf.Stack;

public class BracketMatch {

	public static boolean bracketMath(String str){
		Stack s = new StackSLinked();
		char[] strArr = str.toCharArray();
		for(int i=0;i<strArr.length;i++){
			switch (strArr[i]) {
			case '{':
			case '[':
			case '(':
				s.push(Integer.valueOf(strArr[i]));
				break;
			case '}':
				if(!s.isEmpty() && ((Integer)s.pop()).intValue() == '{')
					break;
				else 
					return false;
			case ']':
				if(!s.isEmpty() && ((Integer)s.pop()).intValue() == '[')
					break;
				else 
					return false;
			case ')':
				if(!s.isEmpty() && ((Integer)s.pop()).intValue() == '(')
					break;
				else 
					return false;
			default:
				break;
			}
		}
		if(s.isEmpty())
			return true;
		else
			return false;
		
	}
	
	public static void main(String[] args) {
		
		String str = "((({{{[[[]]]}}})))";
		System.out.println(BracketMatch.bracketMath(str));
	}
}
