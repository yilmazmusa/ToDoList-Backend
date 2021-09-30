package com.idvlabs.ToDoDemo.dataAcces.abstracts;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.idvlabs.ToDoDemo.core.results.DataResult;
import com.idvlabs.ToDoDemo.entities.concretes.User;

public interface UserDao extends MongoRepository<User, Integer>{
	
	//DataResult<User> getAll();
	DataResult<User> getById(int id);
	DataResult<User> getByfirstName(String firstName);
	User findById(int id);

//	Result add(User user);
//	Result update(User user);
//	Result delete(int userId);

}
