package org.langqiao.exception;

public class StackEmptyException extends RuntimeException{
	
	private static final long serialVersionUID = -1708627893147423605L;

	public StackEmptyException(String err){
		super(err);
	}
}
