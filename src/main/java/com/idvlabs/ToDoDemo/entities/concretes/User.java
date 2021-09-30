package com.idvlabs.ToDoDemo.entities.concretes;


import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "information")
public class User {

	@Id
	private int id;
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	
	 
	private List<ToDo> toDoes;
	
	
	
	

}