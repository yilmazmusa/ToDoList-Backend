package com.idvlabs.ToDoDemo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idvlabs.ToDoDemo.business.abstracts.ToDoService;
import com.idvlabs.ToDoDemo.core.results.DataResult;
import com.idvlabs.ToDoDemo.core.results.Result;
import com.idvlabs.ToDoDemo.core.results.SuccesDataResult;
import com.idvlabs.ToDoDemo.core.results.SuccesResult;
import com.idvlabs.ToDoDemo.dataAcces.abstracts.TodoDao;
import com.idvlabs.ToDoDemo.entities.concretes.ToDo;

@Service
public class TodoManager implements ToDoService {

	private TodoDao todoDao;

	@Autowired
	public TodoManager(TodoDao todoDao) {
		super();
		this.todoDao = todoDao;

	}

	@Override
	public DataResult<List<ToDo>> getAll() {
	
		return new DataResult<List<ToDo>>(this.todoDao.findAll(), true, "Yapilacaklar listesi getirildi.");
	}

	@Override
	public DataResult<ToDo> getById(int id) {
	
		return new SuccesDataResult<ToDo>(null, true, null);
	}

	@Override
	public DataResult<ToDo> getBytodoName(String todoName) {
		
		return new SuccesDataResult<ToDo>(null, true, todoName);
	}

	@Override
	public Result add(ToDo todo) {
	
		this.todoDao.save(todo);
		return new SuccesResult(true, "Yeni yapilacak listesi eklendi");
	}

	@Override
	public Result update(ToDo todo) {
	
		this.todoDao.save(todo);
		
		return new SuccesResult(true, "Yapilacak listesi güncellendi");
	}

	@Override
	public Result delete(int todoId) {
		
		this.todoDao.deleteById(todoId);
		
		return  new SuccesResult(true, "Liste silindi.");
	}

}
