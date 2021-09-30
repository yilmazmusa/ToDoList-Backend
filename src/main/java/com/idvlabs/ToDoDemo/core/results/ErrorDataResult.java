package com.idvlabs.ToDoDemo.core.results;

public class ErrorDataResult<T> extends DataResult<T>{

	public ErrorDataResult(T data, boolean success, String message) {
		super(data, false, message);
		
	}

}
