package com.idvlabs.ToDoDemo.api;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;
import com.idvlabs.ToDoDemo.api.ToDoesController;

import com.idvlabs.ToDoDemo.business.abstracts.ToDoService;

import com.idvlabs.ToDoDemo.core.results.DataResult;

import com.idvlabs.ToDoDemo.entities.concretes.ToDo;




@RestController
@RequestMapping("/todoes")
public class ToDoesController {

	private ToDoService toDoService;

	@Autowired
	public ToDoesController(ToDoService toDoService) {
		super();
		this.toDoService = toDoService;
	}

	@GetMapping(value = "/getall")
	public DataResult<List<ToDo>> getAll(){
	
		return this.toDoService.getAll();
		
	}
	
	@PostMapping(value = "/add")
	public ResponseEntity<?> add(@Validated @RequestBody ToDo toDo) {
		
		return ResponseEntity.ok(this.toDoService.add(toDo));
		
	}
	
	@PostMapping(value = "/update")
	public ResponseEntity<?> update( @Validated @RequestBody ToDo toDo) { 
		return ResponseEntity.ok(this.toDoService.update(toDo));
	}
	
	@GetMapping(value = "/delete")
	public ResponseEntity<?> delete (@Validated @RequestParam int todoId ) {
	
	return ResponseEntity.ok(this.toDoService.delete(todoId));
	
	}
	
	}

	
	


