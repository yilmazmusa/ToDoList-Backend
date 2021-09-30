package com.idvlabs.ToDoDemo.business.abstracts;

import java.util.List;


import com.idvlabs.ToDoDemo.core.results.DataResult;
import com.idvlabs.ToDoDemo.core.results.Result;
import com.idvlabs.ToDoDemo.entities.concretes.ToDo;
import com.idvlabs.ToDoDemo.business.abstracts.ToDoService;


public interface ToDoService {
	
	
	DataResult<List<ToDo>> getAll();
	DataResult<ToDo> getById(int id);
	DataResult<ToDo> getBytodoName(String todoName);
	
	Result add(ToDo todo);
	Result update(ToDo todo);
	Result delete(int todoId);
	
	
	
	
	
	

}
