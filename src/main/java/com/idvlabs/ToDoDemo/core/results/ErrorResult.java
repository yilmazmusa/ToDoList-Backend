package com.idvlabs.ToDoDemo.core.results;

public class ErrorResult extends Result  {

	public ErrorResult(boolean success, String message) {
		super(false, message="Başarisiz.Liste Eklenemedi.");
		
	}

}
