package com.idvlabs.ToDoDemo.core.results;

public class SuccesDataResult<T> extends DataResult<T>{

	public SuccesDataResult(T data, boolean success, String message) {
		super(data, true, message);
		
	}
	
	

	
}
