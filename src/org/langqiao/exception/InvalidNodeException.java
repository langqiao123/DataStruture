package org.langqiao.exception;

public class InvalidNodeException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public InvalidNodeException (String err) {
		super(err);
	}
}
