package com.idvlabs.ToDoDemo.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.idvlabs.ToDoDemo.dataAcces.abstracts.UserDao;
import com.idvlabs.ToDoDemo.entities.concretes.ToDo;
import com.idvlabs.ToDoDemo.entities.concretes.User;


@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserDao userDao;
	
	public UserController(UserDao userDao) {
	this.userDao=userDao;
	}
	
	@PostMapping(value = "/addUser")
	public String addUser(@RequestBody User user) {
		userDao.save(user);
		return  user.getFirstName();
		

	}
}
