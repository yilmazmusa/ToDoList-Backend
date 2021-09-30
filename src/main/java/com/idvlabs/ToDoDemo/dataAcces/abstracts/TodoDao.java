package com.idvlabs.ToDoDemo.dataAcces.abstracts;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.idvlabs.ToDoDemo.entities.concretes.ToDo;


public interface TodoDao extends MongoRepository<ToDo,Integer>{
	
	
	List<ToDo>  findAllById(int id);
	List<ToDo> findAllBytodoName(String todoName);
	
	
	

}
